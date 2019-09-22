package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Seo;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/16 20:01
 * @Param
 * @return
 **/
public interface SeoService {
    ResultBean findAll(ResultBean resultBean);

    ResultBean findOne(Long id);

    void addOrUpdate(Seo seo);
}
