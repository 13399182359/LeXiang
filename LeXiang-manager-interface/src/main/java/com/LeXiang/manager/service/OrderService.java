package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;

import java.text.ParseException;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/14 12:37
 * @Param
 * @return
 **/
public interface OrderService {
    void delete(Long[] ids);

    ResultBean findAll(ResultBean resultBean);

    ResultBean findEcharts(String startDate, String endDate) throws ParseException;

    List poiDown(String[] ids);
}
