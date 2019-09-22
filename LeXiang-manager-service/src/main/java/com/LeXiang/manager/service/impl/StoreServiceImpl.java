package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.StoreResult;
import com.LeXiang.manager.service.StoreService;
import com.LeXiang.mapper.BusinessMapper;
import com.LeXiang.mapper.StoreMapper;
import com.LeXiang.mapper.StorecategoryMapper;
import com.LeXiang.mapper.StorerankMapper;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @类名: StoreServiceImpl
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-11 14:51
 **/
@Service(timeout = 6000)
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreMapper storeMapper;
    @Autowired
    private BusinessMapper businessMapper;
    @Autowired
    private StorerankMapper storerankMapper;
    @Autowired
    private StorecategoryMapper storecategoryMapper;

    @Override
    public PageResult findStore(Integer pageNum, Integer pageSize, Store store) {
        //使用分页的插件
        PageHelper.startPage(pageNum,pageSize);
        //设置查询条件
        StoreExample storeExample = new StoreExample();
        StoreExample.Criteria criteria = storeExample.createCriteria();
        //判断分页的条件是否为空
        if(store!=null){
            if(store.getName()!=null && store.getName().length()>0){
                criteria.andNameLike("%"+store.getName()+"%");
            }
        }
        //new 一个返回值数组
        ArrayList<StoreResult> storeResults = new ArrayList<>();
        //查询出条查的list集合
        List<Store> stores = storeMapper.selectByExample(storeExample);
        //for循环，根据主表 查询类型的数据
        for (Store store1 : stores) {
            Storecategory storecategory = storecategoryMapper.selectByPrimaryKey((long) store1.getStorecategoryId());
            //根据主表 查询商家名称
            Business business = businessMapper.selectByPrimaryKey(store1.getBusinessId());
            //根据主表 查询店铺分类
            Storerank storerank = storerankMapper.selectByPrimaryKey(store1.getStorerankId());
            StoreResult storeResult = new StoreResult(business,store1, storecategory,storerank);
            storeResults.add(storeResult);
        }
        long totalPage=(long)(Math.ceil(storeResults.size()/pageSize)+1);
        return new PageResult(storeResults.size(),storeResults,pageNum,pageSize,totalPage);
    }

    @Override
    public void saveStore(Store store) {
            store.setCreateddate(new Date());
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR,+356);
            Date time = calendar.getTime();
            store.setLastmodifieddate(time);
            store.setEnddate(time);
            Long a = new Long(0);
            store.setVersion(a);
            BigDecimal bigDecimal = new BigDecimal(0);
            store.setBailpaid(bigDecimal);
            store.setStatus(3);
                storeMapper.insert(store);



    }

    @Override
    public List<Business> findBusinessById() {
        List<Business> businesses = businessMapper.selectByExample(null);


        return businesses;
    }

    @Override
    public Store findStoreById(Long id) {
        return storeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delStore(Long[] ids) {
        for (Long id : ids) {
            storeMapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public void updStore(Store store) {
        storeMapper.updateByPrimaryKey(store);
    }
}
