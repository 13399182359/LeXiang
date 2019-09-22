package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.pojo.Business;
import com.LeXiang.pojo.Store;

import java.util.List;

public interface StoreService {


    PageResult findStore(Integer pageNum, Integer pageSize, Store store);

    Store findStoreById(Long id);

    void delStore(Long[] ids);

    void updStore(Store store);

    void saveStore(Store store);

    List<Business> findBusinessById();
}
