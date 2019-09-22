package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.SmsSerive;
import com.LeXiang.mapper.DisplaysetupMapper;
import com.LeXiang.pojo.Displaysetup;
import com.LeXiang.pojo.DisplaysetupExample;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @类名: SmsSerive
 * @描述:
 * @作者: 姚文华
 * @时间: 2019-09-09 22:44
 **/
@Service
public class SmsSeriveImpl  implements SmsSerive {

    @Autowired
    private DisplaysetupMapper displaysetupMapper;


    @Override
    public Displaysetup findSms() {
        return displaysetupMapper.selectByPrimaryKey(1);
    }

    @Override
    public Result smsUpdate(Displaysetup displaysetup) {
        try {
                displaysetupMapper.updateByPrimaryKey(displaysetup);
            return  new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(true,"修改失败");
        }
    }
}

