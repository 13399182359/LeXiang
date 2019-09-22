package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.PromotionService;
import com.LeXiang.mapper.PromotionMapper;
import com.LeXiang.mapper.StoreMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Promotion;
import com.LeXiang.pojo.PromotionExample;
import com.LeXiang.pojo.Store;
import com.LeXiang.pojo.StoreExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/16 20:45
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class PromotionServiceImpl implements PromotionService {
    @Autowired
    private PromotionMapper promotionMapper;

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public ResultBean findAll(ResultBean resultBean) {
        PageHelper.startPage(resultBean.getPage(),resultBean.getMeiPageCount());
        PromotionExample promotionExample = new PromotionExample();
        PromotionExample.Criteria criteria = promotionExample.createCriteria();
        StoreExample storeExample = new StoreExample();
        StoreExample.Criteria storeExampleCriteria = storeExample.createCriteria();
        if (StringUtils.isNotEmpty(resultBean.getWhere())) {
            if (resultBean.getWhere().equals("名称")) {
                criteria.andNameLike("%"+resultBean.getMessage()+"%");
            }else if (resultBean.getWhere().equals("标题")){
                criteria.andTitleLike("%"+resultBean.getMessage()+"%");
            }else if(resultBean.getWhere().equals("店铺")){
                storeExampleCriteria.andNameLike("%"+resultBean.getMessage()+"%");
                resultBean.setTotal(22);
            }
        }
        List list = new ArrayList();
        if (resultBean.getTotal()!=null&&resultBean.getTotal()==22) {
            List<Store> stores = storeMapper.selectByExample(storeExample);
            for (Store store : stores) {
                criteria.andStoreIdEqualTo(store.getId());
                List<Promotion> promotions = promotionMapper.selectByExample(promotionExample);
                if (promotions!=null && promotions.size()>0) {
                    for (Promotion promotion : promotions) {
                        ResultBean bean = new ResultBean();
                        bean.setPromotion(promotion);
                        bean.setStore(store);
                        list.add(bean);
                    }
                }
            }
        }else {
            List<Promotion> promotions = promotionMapper.selectByExample(promotionExample);
            for (Promotion promotion : promotions) {
                Store store = storeMapper.selectByPrimaryKey(promotion.getStoreId());
                ResultBean bean = new ResultBean();
                bean.setStore(store);
                bean.setPromotion(promotion);
                list.add(bean);
            }
        }
        double s1 = (double) list.size()/resultBean.getMeiPageCount();
        return new ResultBean(list.size(),list,resultBean.getPage(),(int)Math.ceil(s1),resultBean.getMeiPageCount());
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            promotionMapper.deleteByPrimaryKey(id);
        }
    }
}
