package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.OrderPaymentService;
import com.LeXiang.mapper.OrderpaymentMapper;
import com.LeXiang.mapper.OrdersMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Orderpayment;
import com.LeXiang.pojo.OrderpaymentExample;
import com.LeXiang.pojo.Orders;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/13 21:50
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class OrderPaymentServiceImpl implements OrderPaymentService {
    @Autowired
    private OrderpaymentMapper orderpaymentMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public ResultBean findAll(ResultBean resultBean) {
        PageHelper.startPage(resultBean.getPage(),resultBean.getMeiPageCount());
        OrderpaymentExample orderpaymentExample = new OrderpaymentExample();
        OrderpaymentExample.Criteria criteria = orderpaymentExample.createCriteria();
        if (StringUtils.isNotEmpty(resultBean.getWhere())) {
            if (resultBean.getWhere().equals("运单号")) {
                criteria.andSnEqualTo(resultBean.getMessage());
            }else if (resultBean.getWhere().equals("付款人")){
                criteria.andPayerLike("%"+resultBean.getMessage()+"%");
            }else if (resultBean.getWhere().equals("账号")){
                criteria.andAccountEqualTo(resultBean.getMessage());
            }
        }
        List<Orderpayment> orderpayments = orderpaymentMapper.selectByExample(orderpaymentExample);
        List list = new ArrayList();
        for (Orderpayment orderpayment : orderpayments) {
            Orders orders = ordersMapper.selectByPrimaryKey(orderpayment.getOrders());
            if (orders!=null) {
                ResultBean resultBean1 = new ResultBean();
                resultBean1.setOrderpayment(orderpayment);
                resultBean1.setOrders(orders);
                list.add(resultBean1);
            }
        }
        double s1 = (double) list.size() / resultBean.getMeiPageCount();
        return new ResultBean(list.size(),list,resultBean.getPage(),(int)Math.ceil(s1),resultBean.getMeiPageCount());
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            orderpaymentMapper.deleteByPrimaryKey(id);
        }
    }
}
