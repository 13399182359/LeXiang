package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Store;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/9 20:51
 * @Param
 * @return
 **/
public interface StoreZhangjrService {

    ResultBean findAll(Store storeBean, Integer page, Integer rows);

    void addOrUpdate(Store storeBean);

    void delete(Long[] ids);

    Store findOne(Long id);
}
