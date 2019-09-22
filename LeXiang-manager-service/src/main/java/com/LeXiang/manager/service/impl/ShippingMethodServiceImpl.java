package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.ShippingMethodService;
import com.LeXiang.mapper.DeliverycorpMapper;
import com.LeXiang.mapper.OrdersMapper;
import com.LeXiang.mapper.ShippingmethodMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/12 16:51
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class ShippingMethodServiceImpl implements ShippingMethodService {
    @Autowired
    private ShippingmethodMapper shippingmethodMapper;
    @Autowired
    private DeliverycorpMapper deliverycorpMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public ResultBean findAll(ResultBean resultBean) {
        PageHelper.startPage(resultBean.getPage(),resultBean.getMeiPageCount());
        ShippingmethodExample example = new ShippingmethodExample();
        ShippingmethodExample.Criteria criteria = example.createCriteria();
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria ordersExampleCriteria = ordersExample.createCriteria();
        DeliverycorpExample deliverycorpExample = new DeliverycorpExample();
        DeliverycorpExample.Criteria deliverycorpExampleCriteria = deliverycorpExample.createCriteria();
        if (StringUtils.isNotEmpty(resultBean.getWhere()) && StringUtils.isNotEmpty(resultBean.getMessage())) {
            if (resultBean.getWhere().equals("运单号")) {
                ordersExampleCriteria.andSnEqualTo(resultBean.getMessage());
            }else if (resultBean.getWhere().equals("收货人")){
                ordersExampleCriteria.andConsigneeLike("%"+resultBean.getMessage()+"%");
            }else if (resultBean.getWhere().equals("地区")){
                ordersExampleCriteria.andAreanameLike("%"+resultBean.getMessage()+"%");
            }else if (resultBean.getWhere().equals("电话")){
                ordersExampleCriteria.andPhoneEqualTo(resultBean.getMessage());
            }
        }
        List list = new ArrayList<>();
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        for (Orders order : orders) {
            Shippingmethod shippingmethod1 = shippingmethodMapper.selectByPrimaryKey(order.getShippingmethodId());
            if (shippingmethod1!=null){
                Deliverycorp deliverycorp = deliverycorpMapper.selectByPrimaryKey(shippingmethod1.getDefaultdeliverycorpId());
                if (deliverycorp!=null) {
                    ResultBean resultBean1 = new ResultBean();
                    resultBean1.setOrders(order);
                    resultBean1.setShippingmethod(shippingmethod1);
                    resultBean1.setDeliverycorp(deliverycorp);
                    list.add(resultBean1);

                }
            }
        }
        double s1 = (double)list.size() / resultBean.getMeiPageCount();
        resultBean.setSumPage((int)Math.ceil(s1));
        return new ResultBean(list.size(),list,resultBean.getDangPage(),(int)Math.ceil(s1),resultBean.getMeiPageCount());
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            shippingmethodMapper.deleteByPrimaryKey(id);
        }
    }
}
