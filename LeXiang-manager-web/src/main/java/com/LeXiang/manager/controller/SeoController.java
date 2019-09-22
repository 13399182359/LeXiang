package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.SeoService;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Seo;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/16 20:12
 * @Param
 * @return
 **/
@RequestMapping("seo")
@RestController
public class SeoController {
    @Reference(timeout = 60000)
    private SeoService seoService;

    @RequestMapping("findAll")
    public ResultBean findAll(ResultBean resultBean){
        return seoService.findAll(resultBean);
    }
    @RequestMapping("findOne")
    public ResultBean findOne(Long id){
        return seoService.findOne(id);
    }
    @RequestMapping("addOrUpdate")
    public ResultBean addOrUpdate(Seo seo){
        try {
            seoService.addOrUpdate(seo);
            return new ResultBean(true,"执行成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"执行失败！");
        }
    }
}
