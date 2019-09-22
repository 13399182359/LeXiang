package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.MessageService;
import com.LeXiang.mapper.MemberMapper;
import com.LeXiang.mapper.MessageMapper;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private MemberMapper memberMapper;


    @Override
    public Result insertMessage(Message message,String username) {
        message.setCreateddate(new Date());

        message.setVersion(1l);
        MemberExample memberExample=new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
        criteria.andUsernameEqualTo(username);

        List<Member> members = memberMapper.selectByExample(memberExample);
        Member member = members.get(0);
        message.setReceiverId(member.getId());


        try {
            messageMapper.insert(message);
            return  new Result(true,"新增成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(true,"新增失败");
        }




    }

    @Override
    public PageResult queryMessage(Message message,Integer page,Integer rows) {
        if(page==null){
            rows=10;
            page=1;
        }
        PageHelper.startPage(page,rows);

        List<PointMember> pointMembers=new ArrayList<>();
        MessageExample messageExample=new MessageExample();
        MessageExample.Criteria criteria = messageExample.createCriteria();
        if(message!=null){
            if(message.getTitle()!=null && message.getTitle().length()>0){
        criteria.andTitleEqualTo(message.getTitle());
        }
        }
        criteria.andIsdraftEqualTo(false);

        List<Message> messages = messageMapper.selectByExample(messageExample);
        for (Message message1 : messages) {
            Member member = memberMapper.selectByPrimaryKey(message1.getReceiverId());
            PointMember pointMember = new PointMember(member,message1);
            pointMembers.add(pointMember);
        }

        int count =messageMapper.countByExample(null);
        long totalPage  = (long) Math.ceil((double) count/ rows) ;

        return new PageResult(pointMembers.size(),pointMembers,page,rows,totalPage);
    } @Override
    public PageResult queryMessage2(Message message,Integer page,Integer rows) {
        if(page==null){
            rows=10;
            page=1;
        }
        PageHelper.startPage(page,rows);

        List<PointMember> pointMembers=new ArrayList<>();
        MessageExample messageExample=new MessageExample();
        MessageExample.Criteria criteria = messageExample.createCriteria();
        if(message!=null){
            if(message.getTitle()!=null && message.getTitle().length()>0){
        criteria.andTitleEqualTo(message.getTitle());
        }
        }
        criteria.andIsdraftEqualTo(true);

        List<Message> messages = messageMapper.selectByExample(messageExample);
        for (Message message1 : messages) {
            Member member = memberMapper.selectByPrimaryKey(message1.getReceiverId());
            PointMember pointMember = new PointMember(member,message1);
            pointMembers.add(pointMember);
        }

        int count =messageMapper.countByExample(null);
        long totalPage  = (long) Math.ceil((double) count/ rows) ;

        return new PageResult(pointMembers.size(),pointMembers,page,rows,totalPage);
    }
}
