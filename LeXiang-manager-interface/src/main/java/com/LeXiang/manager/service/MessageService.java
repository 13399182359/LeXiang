package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.pojo.Message;

public interface MessageService {
    Result insertMessage(Message message,String username);

    PageResult queryMessage(Message message,Integer page,Integer rows);

    PageResult queryMessage2(Message message, Integer page, Integer rows);
}
