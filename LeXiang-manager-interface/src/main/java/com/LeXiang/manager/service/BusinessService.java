package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Business;

import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/9 23:07
 * @Param
 * @return
 **/
public interface BusinessService {
    ResultBean findAll(Integer page, Integer rows, Business businessBean);

    List findOne(Long id);

    void addOrUpdate(Business businessBean);

    void delete(Long[] ids);
}
