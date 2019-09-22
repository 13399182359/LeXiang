package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;

import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/16 22:54
 * @Param
 * @return
 **/
public interface TreeService {

    ResultBean findAll(Integer id);

    List findWhere();
}
