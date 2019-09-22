package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.StoreZhangjrService;
import com.LeXiang.mapper.BusinessMapper;
import com.LeXiang.mapper.StoreMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Business;
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
 * @Date 2019/9/9 21:01
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class StoreZhangjrServiceImpl implements StoreZhangjrService {
    @Autowired
    private StoreMapper storeBeanMapper;
    @Autowired
    private BusinessMapper businessBeanMapper;

    @Override
    public ResultBean findAll(Store storeBean, Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        StoreExample storeBeanExample = new StoreExample();
        StoreExample.Criteria criteria = storeBeanExample.createCriteria();
        if (storeBean!=null) {
            if (StringUtils.isNotEmpty(storeBean.getName())){
                criteria.andNameLike("%"+storeBean.getName()+"%");
            }
            if (StringUtils.isNotEmpty(storeBean.getMobile())){
                criteria.andMobileEqualTo(storeBean.getMobile());
            }
            if (StringUtils.isNotEmpty(storeBean.getEmail())){
                criteria.andEmailEqualTo(storeBean.getEmail());
            }
            if (storeBean.getType()!=null) {
                criteria.andTypeEqualTo(storeBean.getType());
            }
            if (storeBean.getStatus()!=null) {
                criteria.andStatusEqualTo(storeBean.getStatus());
            }
            if (storeBean.getIsenabled()!=null) {
                criteria.andIsenabledEqualTo(storeBean.getIsenabled());
            }
            if (storeBean.getVersion()!=null){
                criteria.andVersionEqualTo(storeBean.getVersion());
            }
        }
        List<Store> storeBeans = storeBeanMapper.selectByExample(storeBeanExample);
       List list = new ArrayList<>();
        for (Store bean : storeBeans) {
            Business businessBean = businessBeanMapper.selectByPrimaryKey(bean.getBusinessId());
            ResultBean resultBean = new ResultBean();
            resultBean.setStore(bean);
            resultBean.setBusiness(businessBean);
            list.add(resultBean);
        }
        Integer count = storeBeanMapper.countByExample(storeBeanExample);
        return new ResultBean(count,list);
    }

    @Override
    public void addOrUpdate(Store storeBean) {
        if (storeBean.getId()!=null) {
            storeBeanMapper.updateByPrimaryKey(storeBean);
        }else {
            storeBeanMapper.insert(storeBean);
        }
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            storeBeanMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public Store findOne(Long id) {
        return storeBeanMapper.selectByPrimaryKey(id);
    }
}
