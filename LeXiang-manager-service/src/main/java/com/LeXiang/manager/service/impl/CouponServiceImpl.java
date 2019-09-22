package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.CouponService;
import com.LeXiang.mapper.CouponMapper;
import com.LeXiang.mapper.StoreMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Coupon;
import com.LeXiang.pojo.CouponExample;
import com.LeXiang.pojo.Store;
import com.LeXiang.pojo.StoreExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/17 19:45
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponMapper couponMapper;
    @Autowired
    private StoreMapper storeMapper;
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            couponMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public ResultBean findAll(ResultBean resultBean) {
        List list = new ArrayList();
        if (StringUtils.isNotEmpty(resultBean.getWhere())) {
            CouponExample couponExample = new CouponExample();
            CouponExample.Criteria criteria = couponExample.createCriteria();
            if (resultBean.getWhere().equals("名称")) {
                criteria.andNameLike("%"+resultBean.getMessage()+"%");
                List<Coupon> coupons = couponMapper.selectByExample(couponExample);
                Set set=new HashSet(coupons);
                coupons.clear();
                coupons.addAll(set);
                for (Coupon coupon : coupons) {
                    ResultBean bean = new ResultBean();
                    Store store = storeMapper.selectByPrimaryKey(coupon.getStoreId());
                    if (store!=null) {
                        bean.setStore(store);
                        bean.setCoupon(coupon);
                        list.add(bean);
                    }
                }
            }else if(resultBean.getWhere().equals("店铺")){
                StoreExample storeExample = new StoreExample();
                StoreExample.Criteria storeExampleCriteria = storeExample.createCriteria();
                storeExampleCriteria.andNameLike("%"+resultBean.getMessage()+"%");
                List<Store> stores = storeMapper.selectByExample(storeExample);
                for (Store store : stores) {

                    criteria.andStoreIdEqualTo(store.getId());
                    List<Coupon> coupons = couponMapper.selectByExample(couponExample);
                    Set set=new HashSet(coupons);
                    coupons.clear();
                    coupons.addAll(set);

                    for (Coupon coupon : coupons) {
                        ResultBean bean = new ResultBean();
                        bean.setStore(store);
                        bean.setCoupon(coupon);
                        list.add(bean);
                    }







                }
            }
        }else {
            CouponExample couponExample = new CouponExample();
            CouponExample.Criteria criteria = couponExample.createCriteria();
            List<Coupon> coupons = couponMapper.selectByExample(couponExample);
            for (Coupon coupon : coupons) {
                ResultBean bean = new ResultBean();
                Store store = storeMapper.selectByPrimaryKey(coupon.getStoreId());
                if (store!=null) {
                    bean.setStore(store);
                    bean.setCoupon(coupon);
                    list.add(bean);
                }
            }
        }
        double s1 = (double) list.size()/resultBean.getMeiPageCount();
        return new ResultBean(list.size(),list,resultBean.getPage(),(int)Math.ceil(s1),resultBean.getMeiPageCount());
    }
}
