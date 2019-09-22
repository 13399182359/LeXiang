package com.LeXiang.manager.controller;


import com.LeXiang.Commons;
import com.LeXiang.Entity.PageResult;
import com.LeXiang.manager.service.OrdersYwhService;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.container.page.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("ordersYwh")
public class OrdersYwhController {

    @Reference
    private OrdersYwhService ordersYwhService;
    @RequestMapping("queryOrders")
    public PageResult queryOrders(HttpSession session,Orders orders, Receiver receiver, Area area, Integer page, Integer rows){
        Business attribute = (Business) session.getAttribute(Commons.SHOPKEY + session.getId());
        Long id=attribute.getId();
        return  ordersYwhService.queryOrders(orders,receiver,area,page,rows,id);

    }
    @RequestMapping("queryOrdersById")
    public PointMember queryOrdersById(Long id){

        return  ordersYwhService.queryOrdersById(id);
    }


}
