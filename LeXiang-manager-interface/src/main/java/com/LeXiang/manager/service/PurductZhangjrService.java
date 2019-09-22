package com.LeXiang.manager.service;

import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.*;

import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/18 9:52
 * @Param
 * @return
 **/
public interface PurductZhangjrService {

    ResultBean findAll(ResultBean resultBean);

    void delete(Long[] ids);

    void addOrUpdate(Product product);

    ResultBean findOne(Long id);

    void updateStatus(Long[] ids, Long where);

    Product findProductKey(Long id);

    ResultBean findOneKey(Long[] id);

    void addCart(Orders orders);

    ResultBean queryCart(Member member);

    List<Store> findAllStore(Business business);
}
