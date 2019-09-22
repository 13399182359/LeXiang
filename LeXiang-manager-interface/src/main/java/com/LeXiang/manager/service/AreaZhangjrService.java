package com.LeXiang.manager.service;

import com.LeXiang.pojo.Receiver;

import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/21 15:12
 * @Param
 * @return
 **/
public interface AreaZhangjrService {
    List findWhere(Long id);

    Receiver addArea(Receiver receiver);
}
