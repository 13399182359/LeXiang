package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/12 16:05
 * @Param
 * @return
 **/
public interface ShippingMethodService {

    ResultBean findAll(ResultBean resultBean);

    void  delete(Long[] ids);
}
