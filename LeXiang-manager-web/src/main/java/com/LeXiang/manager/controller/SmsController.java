package com.LeXiang.manager.controller;

import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.SmsSerive;
import com.LeXiang.pojo.Displaysetup;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @类名: SmsController
 * @描述:
 * @作者: 姚文华
 * @时间: 2019-09-09 21:45
 **/
@RestController
@RequestMapping("managerSms")
public class SmsController {
    @Reference
    private SmsSerive smsService;

    @RequestMapping("smsUpdate")
    public Result smsUpdate(Displaysetup displaysetup) {
        System.out.println(displaysetup);
        return smsService.smsUpdate(displaysetup);
    }

    @RequestMapping("findSms")
    public Displaysetup findSms() {
        return smsService.findSms();
    }

}