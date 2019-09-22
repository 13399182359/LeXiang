package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Categoryapplication;

import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/11 22:05
 * @Param
 * @return
 **/
public interface CategoryApplicationService {

    ResultBean findAll(ResultBean resultBean);

    void delete(Long[] ids);

    void addOrUpdate(Categoryapplication categoryapplication);

    List findOne(Long id);
}
