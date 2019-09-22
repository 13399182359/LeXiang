package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/17 19:44
 * @Param
 * @return
 **/
public interface CouponService {
    void delete(Long[] ids);

    ResultBean findAll(ResultBean resultBean);
}
