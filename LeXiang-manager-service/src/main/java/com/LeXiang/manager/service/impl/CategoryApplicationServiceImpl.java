package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.CategoryApplicationService;
import com.LeXiang.mapper.CategoryapplicationMapper;
import com.LeXiang.mapper.ProductcategoryMapper;
import com.LeXiang.mapper.StoreMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Categoryapplication;
import com.LeXiang.pojo.Productcategory;
import com.LeXiang.pojo.Store;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/11 22:20
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class CategoryApplicationServiceImpl implements CategoryApplicationService {

    @Autowired
    private CategoryapplicationMapper categoryapplicationMapper;
    @Autowired
    private ProductcategoryMapper productcategoryMapper;
    @Autowired
    private StoreMapper storeMapper;
    @Override
    public ResultBean findAll(ResultBean resultBean) {


        return null;
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            categoryapplicationMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void addOrUpdate(Categoryapplication categoryapplication) {
        if (categoryapplication.getId()==null) {
            categoryapplicationMapper.insert(categoryapplication);
        }else {
            categoryapplicationMapper.updateByPrimaryKey(categoryapplication);
        }
    }

    @Override
    public List findOne(Long id) {
        List list = new ArrayList();
        Categoryapplication categoryapplication = categoryapplicationMapper.selectByPrimaryKey(id);
        Productcategory productcategory = productcategoryMapper.selectByPrimaryKey(categoryapplication.getProductcategoryId());
        Store store = storeMapper.selectByPrimaryKey(categoryapplication.getStoreId());
        list.add(categoryapplication);
        list.add(productcategory);
        list.add(store);
        return list;
    }
}
