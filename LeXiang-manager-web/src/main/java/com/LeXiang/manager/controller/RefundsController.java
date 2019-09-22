package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.RefundsService;
import com.LeXiang.mapper.entity.ResultBean;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/13 13:23
 * @Param
 * @return
 **/
@RequestMapping("refunds")
@RestController
public class RefundsController {
    @Reference(timeout = 60000)
    private RefundsService refundsService;

    @RequestMapping("findAll")
    public ResultBean findAll(ResultBean resultBean) {
        return refundsService.findAll(resultBean);
    }
    @RequestMapping("delete")
    public ResultBean delete(Long[] ids) {
        try {
            refundsService.delete(ids);
            return new ResultBean(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"删除失败");
        }
    }
}
