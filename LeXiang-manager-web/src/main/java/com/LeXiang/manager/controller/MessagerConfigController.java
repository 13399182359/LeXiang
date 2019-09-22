package com.LeXiang.manager.controller;

import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.MessagerConfigService;
import com.LeXiang.pojo.Messageconfig;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messagerconfig")
public class MessagerConfigController {

    @Reference
    private MessagerConfigService messagerConfigService;

    @RequestMapping("updateMessagerConfig")
    public Result updateMessagerConfig(Messageconfig messageconfig){
        return messagerConfigService.updateMessagerConfig(messageconfig);
    }
    @RequestMapping("queryMessagerConfig")
    public Messageconfig queryMessagerConfig(Messageconfig messageconfig){
        return  messagerConfigService.queryMessagerConfig(messageconfig);
    }
}
