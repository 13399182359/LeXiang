package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.PointLogService;
import com.LeXiang.mapper.MemberMapper;
import com.LeXiang.mapper.PointlogMapper;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Service
public class PointLogServiceImpl  implements PointLogService {
    @Autowired
    private PointlogMapper pointlogMapper;
    @Autowired
    private MemberMapper memberMapper;


    @Override
    public Map<String, Object> queryMemberUserName(Member member) {
        Map<String,Object> result=new HashMap<>();
        try {
            MemberExample memberExample=new MemberExample();
            MemberExample.Criteria criteria = memberExample.createCriteria();
            criteria.andUsernameEqualTo(member.getUsername());
               Member members = (memberMapper.selectByExample(memberExample)).get(0);
           PointlogExample pointlogExample=new PointlogExample();
            PointlogExample.Criteria criteria1 = pointlogExample.createCriteria();
            criteria1.andMemberIdEqualTo(members.getId());
            List<Pointlog> pointlogs = pointlogMapper.selectByExample(pointlogExample);
            long id=0;
            if(pointlogs.size()>1){
            for (Pointlog pointlog : pointlogs) {
                for (Pointlog pointlog1 : pointlogs) {
                    if(pointlog.getId()<pointlog1.getId()){
                        id=pointlog1.getId();
                    }
                }
            }
            }else{
              id=   pointlogs.get(0).getId();
            }
            Pointlog pointlog = pointlogMapper.selectByPrimaryKey(id);

            result.put("message","success");
            result.put("point",pointlog.getBalance());
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public PageResult queryPoint(Integer page, Integer rows, Pointlog pointlog, Member member) {
        if(page==null){
            rows=2;
            page=1;
        }
        List<Pointlog> pointlogs = pointlogMapper.selectByExample(null);
        PageHelper.startPage(page,rows);

        MemberExample memberExample=new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();

        if(member!=null){
            if(member.getUsername()!=null && member.getUsername()!=""){
                criteria.andNameLike("%"+member.getUsername()+"%");
            }
        }

        List<PointMember> result=new ArrayList<>();


        for (Pointlog pointlog1 : pointlogs) {
            Member member1=memberMapper.selectByPrimaryKey(pointlog1.getMemberId());
            PointMember pointMember=new PointMember(pointlog1,member1);
            if (member != null) {


            if(member.getUsername()!=null && member.getUsername().length()>0){
                if(pointMember.getMember().getUsername().equals(member.getUsername())){
                    result.add(pointMember);
                }
            }

            else {
                result.add(pointMember);
            }
            }else{
                result.add(pointMember);
            }


        }







        int count = pointlogMapper.countByExample(null);


        long totalPage  = (long) Math.ceil((double) count/ rows) ;

        return new PageResult(result.size(),result,page,rows,totalPage);




    }

    @Override
    public Result deletePointLog(Pointlog pointlog) {
        try {
            pointlogMapper.deleteByPrimaryKey(pointlog.getId());
            return  new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(true,"删除失败");
        }
    }

    @Override
    public Result updatePoint(Pointlog pointlog,Member member) {
        PointlogExample pointlogExample=new PointlogExample();

        MemberExample memberExample=new MemberExample();
        MemberExample.Criteria criteria1 = memberExample.createCriteria();


        PointlogExample.Criteria criteria = pointlogExample.createCriteria();
        criteria1.andUsernameEqualTo(member.getUsername());
        Member members = (memberMapper.selectByExample(memberExample)).get(0);

            criteria1.andUsernameEqualTo(members.getUsername());

        criteria.andMemberIdEqualTo(members.getId());
        List<Pointlog> pointlogs = pointlogMapper.selectByExample(pointlogExample);

        long id=0;
        if(pointlogs.size()>1){
        for (Pointlog pointlog2 : pointlogs) {
            for (Pointlog pointlog1 : pointlogs) {
                if(pointlog2.getId()<pointlog1.getId()){
                    id=pointlog1.getId();
                }
            }
        }
        }else{
            id=pointlogs.get(0).getId();
        }
        criteria.andIdEqualTo(id);
        Pointlog pointlog1 = pointlogMapper.selectByPrimaryKey(id);
        if(pointlog.getCredit()==0){
            pointlog1.setBalance(pointlog1.getBalance()+pointlog.getDebit());
        }else{
            pointlog1.setBalance(pointlog1.getBalance()+pointlog.getCredit());
        }



        try {
            //pointlogMapper.updateByExample(pointlog1,pointlogExample);
            pointlog.setBalance(pointlog1.getBalance());
            pointlog.setMemberId(pointlog1.getMemberId());
            pointlog.setCreateddate(new Date());
            pointlogMapper.insert(pointlog);



            return  new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(true,"修改失败");
        }
    }

    @Override
    public Map<String, Object> queryEcharts() {
        Map<String,Object> map=new HashMap<>();
        List<Pointlog> pointlogs = pointlogMapper.selectByExample(null);
        List<Date> createddate=new ArrayList<>();
        List<Long> balance=new ArrayList<>();
        for (Pointlog pointlog : pointlogs) {
            createddate.add(pointlog.getCreateddate());
            balance.add(pointlog.getBalance());
        }
        map.put("createddate",createddate);
        map.put("balance",balance);

        return map;
    }

    @Override
    public List<Pointlog> findAll() {
        return pointlogMapper.selectByExample(null);
    }

    @Override
    public void insert(List<Pointlog> pointlogs) {
        for (Pointlog pointlog : pointlogs) {
            pointlogMapper.insert(pointlog);
        }

    }
}
