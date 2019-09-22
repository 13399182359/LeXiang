package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.OrderPaymentService;
import com.LeXiang.mapper.entity.ResultBean;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/13 21:43
 * @Param
 * @return
 **/
@RequestMapping("orderPayment")
@RestController
public class OrderPaymentController {
    @Reference(timeout = 60000)
    private OrderPaymentService orderPaymentService;

    @RequestMapping("findAll")
    public ResultBean findAll(ResultBean resultBean) {
        return orderPaymentService.findAll(resultBean);
    }
    @RequestMapping("delete")
    public ResultBean delete(Long[] ids) {
        try {
            orderPaymentService.delete(ids);
            return new ResultBean(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"删除失败");
        }
    }
}
