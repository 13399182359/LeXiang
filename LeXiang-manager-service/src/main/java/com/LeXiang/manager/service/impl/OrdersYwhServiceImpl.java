package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.manager.service.OrdersYwhService;
import com.LeXiang.mapper.*;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class OrdersYwhServiceImpl implements OrdersYwhService {

    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private BusinessMapper businessMapper;
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private MemberrankMapper memberrankMapper;
    @Autowired
    private  StoreMapper storeMapper;



    @Override
    public PageResult queryOrders(Orders orders, Receiver receiver, Area area, Integer page, Integer rows, Long id) {
        if(page==null || rows==null){
            page=5;
            rows=1;
        }
            OrdersExample ordersExample=new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        if(orders!=null){

                if(orders.getAddress()!=null &&orders.getAddress().length()>0){
                    criteria.andAddressLike("%"+orders.getAddress()+"%");
                }
                if(orders.getConsignee()!=null && orders.getConsignee().length()>0){
                    criteria.andConsigneeLike("%"+orders.getConsignee()+"%");
                }
                if(orders.getAreaname()!=null && orders.getAreaname().length()>0){
                    criteria.andAreanameLike("%"+orders.getAreaname()+"%");
                }
                if(orders.getSn()!=null && orders.getSn().length()>0){
                    criteria.andSnLike("%"+orders.getSn()+"%");
                }
                if(orders.getZipcode()!=null && orders.getZipcode().length()>0){
                criteria.andZipcodeLike("%"+orders.getZipcode()+"%");
                 }
                if(orders.getPhone()!=null && orders.getPhone().length()>0){
                criteria.andPhoneLike("%"+orders.getPhone()+"%");
                 }
                if(orders.getStatus()!=null && orders.getStatus()!=-1){
                    criteria.andStatusEqualTo(orders.getStatus());
                }
                if(orders.getIsallocatedstock()!=null ){
                    criteria.andIsallocatedstockEqualTo(orders.getIsallocatedstock());
                }

            }
        List<Orders> orders1= ordersMapper.selectByExample(ordersExample);
        List<OrderAll> list2=new ArrayList<OrderAll>();
        for (Orders orders2 : orders1) {
            Member member= memberMapper.selectByPrimaryKey(orders2.getMemberId());
            Store store= storeMapper.selectByPrimaryKey(orders2.getStoreId());
            Business business=businessMapper.selectByPrimaryKey(store.getBusinessId());
            Memberrank memberrank =memberrankMapper.selectByPrimaryKey(member.getMemberrankId());
            OrderAll orderAll = new OrderAll(orders2, store, member, memberrank, business);
            if(orderAll.getBusiness().getId()==id){
                list2.add(orderAll);
            }


        }
        long totalPage  = (long) Math.ceil((double) list2.size()/ rows) ;
        PageHelper.startPage(page,rows);
        return new PageResult(list2.size(),list2,page,rows,totalPage);
    }

    @Override
    public PointMember queryOrdersById(Long id) {
        Orders orders = ordersMapper.selectByPrimaryKey(id);
        Member member= memberMapper.selectByPrimaryKey(orders.getMemberId());
        Memberrank memberrank=memberrankMapper.selectByPrimaryKey(member.getMemberrankId());
        PointMember pointMember=new PointMember(memberrank,orders);

        return pointMember;
    }
}
