package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.CouponService;
import com.LeXiang.mapper.entity.ResultBean;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/17 20:00
 * @Param
 * @return
 **/
@RequestMapping("coupon")
@RestController
public class CouponController {
    @Reference(timeout = 60000)
    private CouponService couponService;
    @RequestMapping("delete")
    public ResultBean delete(Long[] ids){
        try {
            couponService.delete(ids);
            return new ResultBean(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"删除失败");
        }
    }
    @RequestMapping("findAll")
    public ResultBean findAll(ResultBean resultBean) {
        return couponService.findAll(resultBean);
    }
}
