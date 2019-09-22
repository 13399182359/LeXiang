package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.RefundsService;
import com.LeXiang.mapper.OrdersMapper;
import com.LeXiang.mapper.PaymentmethodMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Orders;
import com.LeXiang.pojo.OrdersExample;
import com.LeXiang.pojo.Paymentmethod;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/13 13:31
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class RefundsServiceImpl implements RefundsService {
    @Autowired
    private PaymentmethodMapper paymentmethodMapper;
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public ResultBean findAll(ResultBean resultBean) {
        PageHelper.startPage(resultBean.getPage(),resultBean.getMeiPageCount());
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria ordersExampleCriteria = ordersExample.createCriteria();
        if (StringUtils.isNotEmpty(resultBean.getWhere())) {
            if (resultBean.getWhere().equals("运单号")) {
                ordersExampleCriteria.andSnEqualTo(resultBean.getMessage());
            }else if (resultBean.getWhere().equals("收货人")){
                ordersExampleCriteria.andConsigneeLike("%"+resultBean.getMessage()+"%");
            }else if (resultBean.getWhere().equals("电话")){
                ordersExampleCriteria.andPhoneEqualTo(resultBean.getMessage());
            }
        }
        List list = new ArrayList();
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        for (Orders order : orders) {
            Paymentmethod paymentmethod = paymentmethodMapper.selectByPrimaryKey(order.getPaymentmethodId());
            if (paymentmethod!=null) {
                ResultBean resultBean1 = new ResultBean();
                resultBean1.setOrders(order);
                resultBean1.setPaymentmethod(paymentmethod);
                list.add(resultBean1);
            }
        }
        double s1 = (double) list.size() / resultBean.getMeiPageCount();
        return new ResultBean(list.size(),list,resultBean.getPage(),(int)Math.ceil(s1),resultBean.getMeiPageCount());
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            paymentmethodMapper.deleteByPrimaryKey(id);
        }
    }
}
