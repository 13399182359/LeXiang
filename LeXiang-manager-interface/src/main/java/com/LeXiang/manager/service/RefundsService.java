package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/13 13:24
 * @Param
 * @return
 **/
public interface RefundsService {
    ResultBean findAll(ResultBean resultBean);

    void delete(Long[] ids);


}
