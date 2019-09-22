package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.OrderService;
import com.LeXiang.mapper.MemberrankMapper;
import com.LeXiang.mapper.OrdersMapper;
import com.LeXiang.mapper.StoreMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Memberrank;
import com.LeXiang.pojo.Orders;
import com.LeXiang.pojo.OrdersExample;
import com.LeXiang.pojo.Store;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/14 13:02
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private StoreMapper storeMapper;
    @Autowired
    private MemberrankMapper memberrankMapper;
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
            }else if (resultBean.getWhere().equals("地区")){
                ordersExampleCriteria.andAreanameLike("%"+resultBean.getMessage()+"%");
            }
        }
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        List list = new ArrayList();
        for (Orders order : orders) {
            Store store = storeMapper.selectByPrimaryKey(order.getStoreId());
            Memberrank memberrank = memberrankMapper.selectByPrimaryKey(Long.valueOf(order.getType()));
            if (store!=null && memberrank!=null) {
                ResultBean bean = new ResultBean();
                bean.setOrders(order);
                bean.setStore(store);
                bean.setMemberrank(memberrank);
                list.add(bean);
            }
        }
        double s1 = (double) list.size()/resultBean.getMeiPageCount();
        return new ResultBean(list.size(),list,resultBean.getPage(),(int)Math.ceil(s1),resultBean.getMeiPageCount());
    }

    @Override
    public ResultBean findEcharts(String startDate, String endDate) throws ParseException {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            if (StringUtils.isNotEmpty(startDate)) {
                criteria.andCreateddateGreaterThanOrEqualTo(simpleDateFormat.parse(startDate));
            }
            if (StringUtils.isNotEmpty(endDate)) {
                criteria.andCreateddateLessThanOrEqualTo(simpleDateFormat.parse(endDate));
            }
        List<Orders> ordersList = ordersMapper.selectByExample(ordersExample);
        List list = new ArrayList();
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        for (Orders orders : ordersList) {
            list.add(orders.getCreateddate());
            list1.add(orders.getAmount());
            list2.add(orders.getQuantity());
        }
        List list3 = new ArrayList();
        list3.add(list);
        list3.add(list1);
        list3.add(list2);
        ResultBean bean = new ResultBean();
        bean.setRows(list3);
        return bean;
    }

    @Override
    public List poiDown(String[] ids) {
        List<Orders> orders = ordersMapper.selectByExample(null);
        List list = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List list1 = new ArrayList();
        String[] array = {"运单号","订单金额","会员","店铺","收货人","支付方式","配送方式","状态","创建日期","电话"};
        for (Orders order : orders) {
            Store store = storeMapper.selectByPrimaryKey(order.getStoreId());
            Memberrank memberrank = memberrankMapper.selectByPrimaryKey(Long.valueOf(order.getType()));
            Object[] oederArr = new Object[array.length];
            if (store!=null && memberrank!=null) {
                oederArr[0] = order.getSn();
                oederArr[1]=memberrank.getName();
                oederArr[2]=store.getName();
                oederArr[3] = order.getConsignee();
                oederArr[4] = order.getPaymentmethodname();
                oederArr[5] = order.getShippingmethodname();
                if (order.getStatus()==1) {
                    oederArr[6] = "等待收款";
                }else if(order.getStatus()==2){
                    oederArr[6] = "无需收款";
                }else if(order.getStatus()==3){
                    oederArr[6] = "等待退款";
                }else if(order.getStatus()==4){
                    oederArr[6] = "无需退款";
                }else if(order.getStatus()==5){
                    oederArr[6] = "已分配库存";
                }else if(order.getStatus()==6){
                    oederArr[6] = "未分配库存";
                }else if(order.getStatus()==7){
                    oederArr[6] = "已过期";
                }else if(order.getStatus()==8){
                    oederArr[6] = "未过期";
                }else {
                    oederArr[6] = "空";
                }
                oederArr[7] = simpleDateFormat.format(order.getCreateddate());
                list.add(oederArr);
            }
        }

        list1.add(array);
        list1.add(list);
        return list1;
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            ordersMapper.deleteByPrimaryKey(id);
        }
    }
}
