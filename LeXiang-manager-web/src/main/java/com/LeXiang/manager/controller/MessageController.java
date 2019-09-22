package com.LeXiang.manager.controller;


import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.MessageService;
import com.LeXiang.pojo.Message;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {

    @Reference
    private MessageService messageService;

    @RequestMapping("insertMessage")
    public Result insertMessage(Message message,String username){
        return messageService.insertMessage(message,username);
    }

    @RequestMapping("queryMessage")
    public PageResult queryMessage(Message message,Integer page,Integer rows){
        return  messageService.queryMessage(message,page,rows);
    } @RequestMapping("queryMessage2")
    public PageResult queryMessage2(Message message,Integer page,Integer rows){
        return  messageService.queryMessage2(message,page,rows);
    }
}
