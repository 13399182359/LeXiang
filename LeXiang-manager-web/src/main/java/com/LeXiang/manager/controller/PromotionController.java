package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.PromotionService;
import com.LeXiang.mapper.entity.ResultBean;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/16 21:15
 * @Param
 * @return
 **/
@RequestMapping("promotion")
@RestController
public class PromotionController {
    @Reference(timeout = 60000)
    private PromotionService promotionService;

    @RequestMapping("findAll")
    public ResultBean findAll(ResultBean resultBean) {
        return promotionService.findAll(resultBean);
    }
    @RequestMapping("delete")
    public ResultBean delete(Long[] ids){
        try {
            promotionService.delete(ids);
            return new ResultBean(true,"删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"删除失败！");
        }
    }
}
