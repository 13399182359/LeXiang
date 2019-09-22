package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/16 20:42
 * @Param
 * @return
 **/
public interface PromotionService {
    ResultBean findAll(ResultBean resultBean);

    void delete(Long[] ids);
}
