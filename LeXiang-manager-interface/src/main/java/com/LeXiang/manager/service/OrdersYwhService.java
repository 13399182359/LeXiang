package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.pojo.Area;
import com.LeXiang.pojo.Orders;
import com.LeXiang.pojo.PointMember;
import com.LeXiang.pojo.Receiver;

public interface OrdersYwhService {
    PageResult queryOrders(Orders orders, Receiver receiver, Area area, Integer page, Integer rows, Long id);

    PointMember queryOrdersById(Long id);
}
