package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.MemberUserService;
import com.LeXiang.mapper.MemberMapper;
import com.LeXiang.mapper.UsersMapper;
import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.MemberExample;
import com.LeXiang.pojo.Users;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Service
public class MemberUserServiceImpl implements MemberUserService {
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Member queryUserByAccount(String username) {

        Member member=null;
        MemberExample memberExample=new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
        if(username!=null && username.length()>0){
            criteria.andUsernameEqualTo(username);
            List<Member> members = memberMapper.selectByExample(memberExample);
            member = members.get(0);

            return member;
        }else {

            return  member;

        }


    }

    @Override
    public Result register(Member member) {

        Member member1=null;
        if(member==null){
            return new Result(false,"注册信息不能为空");
        }
        if(member.getUsername()==null ||member.getUsername().equals("")){
            return new Result(false,"注册信息不能为空");
        }

        Result result=new Result();
        MemberExample memberExample=new MemberExample();
        MemberExample memberExample1=new MemberExample();
        MemberExample memberExample2=new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
        MemberExample.Criteria criteria1 = memberExample1.createCriteria();
        MemberExample.Criteria criteria2 = memberExample2.createCriteria();
        if(member.getUsername() !=null && member.getUsername().length()>0){
            criteria.andUsernameEqualTo(member.getUsername());
            List<Member> members = memberMapper.selectByExample(memberExample);

            if(members.size()>0){
                return  new Result(false,"账号已经被注册");
            }
        }
        if(member.getEmail()==null ||member.getEmail().equals("")){
            return new Result(false,"注册信息不能为空");
        }

        if(member.getEmail() !=null && member.getEmail().length()>0){
            criteria1.andEmailEqualTo(member.getEmail());
            List<Member> members = memberMapper.selectByExample(memberExample1);
            if(members.size()>0){
                return  new Result(false,"该邮箱已经被注册");
            }
        }
        if(member.getMobile()==null ||member.getMobile().equals("")){
            return new Result(false,"注册信息不能为空");
        }
         if(member.getMobile() !=null && member.getMobile().length()>0){
                    criteria2.andMobileEqualTo(member.getMobile());
             List<Member> members = memberMapper.selectByExample(memberExample2);
             if(members.size()>0){
                        return  new Result(false,"该手机已经被注册");
                    }
         }

        member.setMemberrankId(1l);

        memberMapper.insert(member);
         MemberExample memberExample3=new MemberExample();
        MemberExample.Criteria criteria3 = memberExample3.createCriteria();
        criteria3.andNameEqualTo(member.getName());
        List<Member> members = memberMapper.selectByExample(memberExample);
        Member member2 = members.get(0);
        Users user=new Users();
        user.setCreateddate(new Date());
        user.setId(member2.getId());
        usersMapper.insert(user);
        return new Result(true,"注册成功");




    }
}
