package com.LeXiang.manager.controller;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.CashService;
import com.LeXiang.pojo.Business;
import com.LeXiang.pojo.Cash;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: CashController
 * @描述:
 * @作者: 姚文华
 * @时间: 2019-09-10 23:33
 **/
@RestController
@RequestMapping("cash")
public class CashController {
    @Reference
    private CashService cashService;


    @RequestMapping("queryCash")
    public PageResult queryCash(Integer page, Integer rows, Cash cash, Business business){
        return cashService.findCash(page,rows,cash,business);
    }
    @RequestMapping("deleteCash")
    public Result deleteCash(Cash cash){
        return cashService.deleteCash(cash);
    }
}

