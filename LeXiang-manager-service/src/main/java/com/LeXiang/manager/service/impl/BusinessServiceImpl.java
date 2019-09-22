package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.BusinessService;
import com.LeXiang.mapper.BusinessMapper;
import com.LeXiang.mapper.StoreMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Business;
import com.LeXiang.pojo.BusinessExample;
import com.LeXiang.pojo.Store;
import com.LeXiang.pojo.StoreExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/9 23:10
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private BusinessMapper businessBeanMapper;
    @Autowired
    private StoreMapper storeBeanMapper;
    @Override
    public ResultBean findAll(Integer page, Integer rows, Business businessBean) {
        PageHelper.startPage(page,rows);
        BusinessExample businessBeanExample = new BusinessExample();
        BusinessExample.Criteria criteria = businessBeanExample.createCriteria();
        if (businessBean!=null) {
            if (StringUtils.isNotEmpty(businessBean.getLegalperson())) {
                criteria.andLegalpersonLike("%"+businessBean.getLegalperson()+"%");
            }
            if (StringUtils.isNotEmpty(businessBean.getEmail())) {
                criteria.andEmailEqualTo(businessBean.getEmail());
            }
        }
        System.out.println(1);
        List<Business> list = businessBeanMapper.selectByExample(businessBeanExample);
        System.out.println(2);
        Integer count = businessBeanMapper.countByExample(businessBeanExample);
        List list1 = new ArrayList<>();
        for (Business bean : list) {
            StoreExample storeBeanExample = new StoreExample();
            StoreExample.Criteria criteria1 = storeBeanExample.createCriteria();
            criteria1.andBusinessIdEqualTo(bean.getId());
            List<Store> storeBeans = storeBeanMapper.selectByExample(storeBeanExample);
            ResultBean resultBean = new ResultBean();
            if (storeBeans.size()>0){
                resultBean.setStore(storeBeans.get(0));
            }
            resultBean.setBusiness(bean);
            list1.add(resultBean);
        }
        return new ResultBean(count,list1);
    }

    @Override
    public List findOne(Long id) {
        Business business = businessBeanMapper.selectByPrimaryKey(id);
        StoreExample storeExample = new StoreExample();
        StoreExample.Criteria criteria = storeExample.createCriteria();
        criteria.andBusinessIdEqualTo(id);
        List<Store> stores = storeBeanMapper.selectByExample(storeExample);
       List list = new ArrayList<>();
       list.add(business);
       list.add(stores.get(0));
        return list;
    }

    @Override
    public void addOrUpdate(Business businessBean) {
        if (businessBean.getId()!=null) {
            businessBeanMapper.updateByPrimaryKey(businessBean);
            StoreExample storeExample = new StoreExample();
            StoreExample.Criteria criteria = storeExample.createCriteria();
            criteria.andBusinessIdEqualTo(businessBean.getId());
            Store store = storeBeanMapper.selectByExample(storeExample).get(0);
            Long id = store.getId();
            BeanUtils.copyProperties(businessBean,store);
            store.setId(id);
            storeBeanMapper.updateByPrimaryKey(store);
        }else {
            Store store = new Store();
            BeanUtils.copyProperties(businessBean,store);
            businessBeanMapper.insert(businessBean);
            store.setCreateddate(new Date());
            store.setLastmodifieddate(new Date());
            List<Business> businesses = businessBeanMapper.selectByExample(null);
            Long id = null;
            for (Business business : businesses) {
                for (Business business1 : businesses) {
                    if (business.getId()<business1.getId()){
                        id = business1.getId();
                    }
                }
            }
            store.setBusinessId(id);
            store.setStorecategoryId(1l);
            store.setStorerankId(1l);
            storeBeanMapper.insert(store);
        }
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            businessBeanMapper.deleteByPrimaryKey(id);
            StoreExample storeExample = new StoreExample();
            StoreExample.Criteria criteria = storeExample.createCriteria();
            criteria.andBusinessIdEqualTo(id);
            storeBeanMapper.deleteByExample(storeExample);
        }
    }
}
