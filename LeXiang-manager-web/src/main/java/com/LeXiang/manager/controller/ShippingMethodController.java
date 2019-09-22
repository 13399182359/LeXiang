package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.ShippingMethodService;
import com.LeXiang.mapper.entity.ResultBean;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/12 20:46
 * @Param
 * @return
 **/
@RequestMapping("shippingMethod")
@RestController
public class ShippingMethodController {
    @Reference(timeout = 60000)
    private ShippingMethodService shippingMethodService;
    @RequestMapping("findAll")
    public ResultBean findAll(ResultBean resultBean){
        return shippingMethodService.findAll(resultBean);
    }
    @RequestMapping("delete")
    public ResultBean delete(Long[] ids){
        try {
            shippingMethodService.delete(ids);
            return new ResultBean(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(true,"删除失败");
        }
    }
}
