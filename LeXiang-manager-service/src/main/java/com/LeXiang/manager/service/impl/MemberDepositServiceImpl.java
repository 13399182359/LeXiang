package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.MemberDepositService;
import com.LeXiang.mapper.MemberMapper;
import com.LeXiang.mapper.MemberdepositlogMapper;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.*;

@Service
public class MemberDepositServiceImpl implements MemberDepositService {
    @Autowired
    private MemberdepositlogMapper memberdepositlogMapper;
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public PageResult queryMemberdepositlog(Integer page, Integer rows, Memberdepositlog memberdepositlog, Member member) {
        if(page==null){
            rows=10;
            page=1;
        }
        PageHelper.startPage(page,rows);

        MemberExample memberExample=new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
        MemberdepositlogExample memberdepositlogExample=new MemberdepositlogExample();
        MemberdepositlogExample.Criteria criteria1 = memberdepositlogExample.createCriteria();
        if(member!=null){
            if(member.getUsername()!=null && member.getUsername()!=""){
                criteria.andNameLike("%"+member.getUsername()+"%");
            }
        }
        List<Member> memberExample1 = memberMapper.selectByExample(memberExample);
        List<PointMember> result=new ArrayList<>();
        List<Memberdepositlog> pointlogs = memberdepositlogMapper.selectByExample(memberdepositlogExample);
        for (Memberdepositlog pointlog1 : pointlogs) {
            Member member1=memberMapper.selectByPrimaryKey(pointlog1.getMemberId());
            PointMember pointMember=new PointMember(member1,pointlog1);

            if(member.getUsername()==null || member.getUsername().equals("")){
                result.add(pointMember);
            }else{
                if(pointMember.getMember().getUsername().equals(member.getUsername())){
                    result.add(pointMember);
                }
            }
        }
         int count=memberdepositlogMapper.countByExample(memberdepositlogExample);

        long totalPage  = (long) Math.ceil((double) count/ rows) ;

        return new PageResult(count,result,page,rows,totalPage);
    }

    @Override
    public Result deleteMemberdepositlog(Memberdepositlog memberdepositlog) {

        try {
            memberdepositlogMapper.deleteByPrimaryKey(memberdepositlog.getId());
            return  new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(true,"删除失败");
        }
    }

    @Override
    public Result updateMemberdepositlog(Memberdepositlog memberdepositlog, Member member) {
        MemberdepositlogExample memberdepositlogExample=new MemberdepositlogExample();

        MemberExample memberExample=new MemberExample();
        MemberExample.Criteria criteria1 = memberExample.createCriteria();
        MemberdepositlogExample.Criteria criteria = memberdepositlogExample.createCriteria();
        criteria1.andUsernameEqualTo(member.getUsername());
        Member members = (memberMapper.selectByExample(memberExample)).get(0);

        criteria1.andUsernameEqualTo(members.getUsername());

        criteria.andMemberIdEqualTo(members.getId());
        List<Memberdepositlog> memberdepositlogs = memberdepositlogMapper.selectByExample(memberdepositlogExample);
        long id=0;
        for (Memberdepositlog pointlog2 : memberdepositlogs) {
            for (Memberdepositlog pointlog1 : memberdepositlogs) {
                if(pointlog2.getId()<pointlog1.getId()){
                    id=pointlog1.getId();
                }
            }
        }
        criteria.andIdEqualTo(id);
        Memberdepositlog memberdepositlog1 = memberdepositlogMapper.selectByPrimaryKey(id);
        if(memberdepositlog.getCredit().equals("0")){
             BigDecimal a=memberdepositlog1.getBalance().add(memberdepositlog.getDebit());
            memberdepositlog1.setBalance(a);
        }else{
            BigDecimal b=memberdepositlog1.getBalance().add(memberdepositlog.getCredit());
            memberdepositlog1.setBalance(b);
        }



        try {
            //pointlogMapper.updateByExample(pointlog1,pointlogExample);
            memberdepositlog.setBalance(memberdepositlog1.getBalance());
            memberdepositlog.setMemberId(memberdepositlog1.getMemberId());
            memberdepositlog.setType(1);
            memberdepositlog.setCreateddate(new Date());
            memberdepositlogMapper.insert(memberdepositlog);



            return  new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(true,"修改失败");
        }
}

    @Override
    public Map<String, Object> queryMemberUserName(Member member) {
        Map<String,Object> result=new HashMap<>();
        try {
            MemberExample memberExample=new MemberExample();
            MemberExample.Criteria criteria = memberExample.createCriteria();
            criteria.andUsernameEqualTo(member.getUsername());
            Member members = (memberMapper.selectByExample(memberExample)).get(0);
            MemberdepositlogExample memberdepositlogExample=new MemberdepositlogExample();
            MemberdepositlogExample.Criteria criteria1 = memberdepositlogExample.createCriteria();
          /*  PointlogExample pointlogExample=new PointlogExample();
            PointlogExample.Criteria criteria1 = pointlogExample.createCriteria();*/
            criteria1.andMemberIdEqualTo(members.getId());
            List<Memberdepositlog> memberdepositlogs = memberdepositlogMapper.selectByExample(memberdepositlogExample);
            long id=0;
            for (Memberdepositlog memberdepositlog : memberdepositlogs) {
                for (Memberdepositlog memberdepositlog2 : memberdepositlogs) {
                    if(memberdepositlog.getId()<memberdepositlog2.getId()){
                        id=memberdepositlog2.getId();
                    }
                }
            }
            Memberdepositlog memberdepositlog = memberdepositlogMapper.selectByPrimaryKey(id);

            result.put("message","success");
            result.put("balance",memberdepositlog.getBalance());
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Memberdepositlog> findAll() {
        return memberdepositlogMapper.selectByExample(null);
    }

    @Override
    public void insert(List<Memberdepositlog> pointlogs) {
        for (Memberdepositlog pointlog : pointlogs) {
            memberdepositlogMapper.insert(pointlog);
        }

    }
    @Override
    public Map<String, Object> queryEcharts() {
        Map<String,Object> map=new HashMap<>();
        List<Memberdepositlog> pointlogs = memberdepositlogMapper.selectByExample(null);
        List<Date> createddate=new ArrayList<>();
        List<BigDecimal> balance=new ArrayList<>();
        for (Memberdepositlog pointlog : pointlogs) {
            createddate.add(pointlog.getCreateddate());
            balance.add(pointlog.getBalance());
        }
        map.put("createddate",createddate);
        map.put("balance",balance);

        return map;
    }


}
