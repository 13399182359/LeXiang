package com.LeXiang.manager.controller;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.ConsultationService;
import com.LeXiang.pojo.Consultation;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consulation")
public class ConsultationController {
    @Reference
    private ConsultationService consultationService;



    @RequestMapping("queryConsulatiton")
    public PageResult queryConsulatiton (Integer page, Integer rows, Consultation consultation){
        return  consultationService.queryConsulatiton(page,rows,consultation);
    }

    @RequestMapping("deleteConsulatiton")
    public Result deleteConsulatiton(Consultation consultation){
        return consultationService.deleteConsulatiton(consultation);
    }

}
