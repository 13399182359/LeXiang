package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.MemberResult;
import com.LeXiang.Entity.PageResult;
import com.LeXiang.manager.service.MemberService;
import com.LeXiang.mapper.MemberMapper;
import com.LeXiang.mapper.MemberattributeMapper;
import com.LeXiang.mapper.MemberrankMapper;
import com.LeXiang.mapper.UsersMapper;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(timeout = 6000)
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private MemberrankMapper memberrankMapper;
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private MemberattributeMapper memberattributeMapper;
    @Override
    public PageResult findMember(Integer pageNum, Integer pageSize, Member member) {
        //使用分页的插件
        PageHelper.startPage(pageNum, pageSize);
        //设置查询条件
        MemberExample memberExample = new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
        //判断分页的条件是否为空
        if (member != null) {
            if (member.getUsername() != null && member.getUsername().length() > 0) {
                criteria.andUsernameLike("%" + member.getUsername() + "%");
            }
            if (member.getEmail() != null && member.getEmail().length() > 0) {
                criteria.andEmailEqualTo(member.getEmail());
            }
        }
        //new 一个返回值数组
        ArrayList<MemberResult> memberResult = new ArrayList<>();
        List<Member> members = memberMapper.selectByExample(memberExample);
        //for循环，取出第二张表的id 根据id查到第二张表的数据
        for (Member member1 : members) {
            Memberrank memberrank = memberrankMapper.selectByPrimaryKey(member1.getMemberrankId());
            Users users = usersMapper.selectByPrimaryKey(member1.getId());
            MemberResult memberResult1 = new MemberResult(member1,memberrank,users);
            memberResult.add(memberResult1);
        }
        long totalPage = (long) (Math.ceil(memberResult.size() / pageSize) + 1);
        return new PageResult(memberResult.size(), memberResult, pageNum, pageSize, totalPage);
    }

    @Override
    public void addMember(Member member) {
        memberMapper.insert(member);
        //设置查询条件
        MemberExample memberExample = new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
        criteria.andUsernameEqualTo(member.getUsername());
        List<Member> members = memberMapper.selectByExample(memberExample);
        Users users = new Users();
        users.setId(members.get(0).getId());
        users.setCreateddate(new Date());
        users.setLastlogindate(new Date());

        if(members.get(0).getAttributevalue0().equals("true")){
            users.setIsenabled(true);
        }else{
            users.setIsenabled(false);
        }
        usersMapper.insert(users);
    }

    @Override
    public MemberResult toUpdMember(Long id) {
        Member member = memberMapper.selectByPrimaryKey(id);
        Memberrank memberrank = memberrankMapper.selectByPrimaryKey(member.getMemberrankId());
        Users users = usersMapper.selectByPrimaryKey(member.getId());
        MemberResult memberResult = new MemberResult();
        memberResult.setMember(member);
        memberResult.setMemberrank(memberrank);
        memberResult.setUsers(users);
        return memberResult;
    }


    @Override
    public void delMember(Long[] ids) {
        for (Long id : ids) {
            memberMapper.deleteByPrimaryKey(id);
            usersMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void editMember(Member member) {
        memberMapper.updateByPrimaryKey(member);
    }
//===================================================================================


    @Override
    public PageResult findMemberRank(Integer pageNum, Integer pageSize, Memberrank memberrank) {
        PageHelper.startPage(pageNum,pageSize);
        MemberrankExample memberrankExample = new MemberrankExample();
        MemberrankExample.Criteria criteria = memberrankExample.createCriteria();
        if(memberrank!=null){
            if(memberrank.getName()!=null && memberrank.getName().length()>0){
                criteria.andNameLike("%"+memberrank.getName()+"%");
            }
        }
        List<Memberrank> memberranks = memberrankMapper.selectByExample(memberrankExample);
        long totalPage = (long) (Math.ceil(memberranks.size() / pageSize) + 1);
        return new PageResult(memberranks.size(),memberranks,pageNum,pageSize,totalPage);
    }

    @Override
    public void addMemberRank(Memberrank memberrank) {
        memberrank.setCreateddate(new Date());
        memberrank.setLastmodifieddate(new Date());
        memberrankMapper.insert(memberrank);
    }

    @Override
    public void editMemberRank(Memberrank memberrank) {
        memberrankMapper.updateByPrimaryKey(memberrank);
    }

    @Override
    public Memberrank toUpdMemberRank(Long id) {
        return memberrankMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delMembeRank(Long[] ids) {
        for (Long id : ids) {
            memberrankMapper.deleteByPrimaryKey(id);
        }

    }


//===================================会员注册============================================================

    @Override
    public PageResult findMemberAtt(Integer pageNum, Integer pageSize, Memberattribute memberattribute) {
        PageHelper.startPage(pageNum,pageSize);
        MemberattributeExample memberattributeExample = new MemberattributeExample();
        MemberattributeExample.Criteria criteria = memberattributeExample.createCriteria();
        if(memberattribute!=null){
            if(memberattribute.getName()!=null && memberattribute.getName().length()>0){
                criteria.andNameLike("%"+memberattribute.getName()+"%");
            }
        }
        List<Memberattribute> memberattributes = memberattributeMapper.selectByExample(memberattributeExample);
        long totalPage = (long) (Math.ceil(memberattributes.size() / pageSize) + 1);
        return new PageResult(memberattributes.size(),memberattributes,pageNum,pageSize,totalPage);
    }

    @Override
    public void addMemberAtt(Memberattribute memberattribute) {
        memberattribute.setCreateddate(new Date());
        memberattribute.setLastmodifieddate(new Date());
        memberattributeMapper.insert(memberattribute);
    }

    @Override
    public void editMemberAtt(Memberattribute memberattribute) {
        memberattributeMapper.updateByPrimaryKey(memberattribute);
    }

    @Override
    public Memberattribute toUpdMemberAtt(Long id) {
        return memberattributeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delMembeAtt(Long[] ids) {
        for (Long id : ids) {
            memberattributeMapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public List<Memberrank> findAll() {
        return memberrankMapper.selectByExample(null);
    }



}