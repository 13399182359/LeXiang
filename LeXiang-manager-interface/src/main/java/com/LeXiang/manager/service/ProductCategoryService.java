package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Productcategory;

import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/11 22:05
 * @Param
 * @return
 **/
public interface ProductCategoryService {

    ResultBean findAll(Integer page, Integer rows, Productcategory productcategory);

    void delete(Long[] ids);

    void addOrUpdate(Productcategory productcategory);

    List findOne(Long id);
}
