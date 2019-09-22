package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.ProductCategoryService;
import com.LeXiang.mapper.ProductcategoryMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Productcategory;
import com.LeXiang.pojo.ProductcategoryExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/11 22:23
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductcategoryMapper productcategoryMapper;
    @Override
    public ResultBean findAll(Integer page, Integer rows, Productcategory productcategory) {
        PageHelper.startPage(page,rows);
        ProductcategoryExample productcategoryExample = new ProductcategoryExample();
        ProductcategoryExample.Criteria criteria = productcategoryExample.createCriteria();
        if (productcategory!=null) {
            if (StringUtils.isNotEmpty(productcategory.getName())) {
                criteria.andNameLike("%"+productcategory.getName()+"%");
            }
            if (productcategory.getParentId()!=null) {
                criteria.andParentIdEqualTo(productcategory.getParentId());
            }
        }
        List<Productcategory> productcategories = productcategoryMapper.selectByExample(productcategoryExample);
        Integer count = productcategoryMapper.countByExample(productcategoryExample);
        double s1 = (double) count/rows;
        return new ResultBean(count,productcategories,page,(int)Math.ceil(s1),rows);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            productcategoryMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void addOrUpdate(Productcategory productcategory) {
        if (productcategory.getId()==null) {
            productcategoryMapper.insert(productcategory);
        }else {
            productcategoryMapper.updateByPrimaryKey(productcategory);
        }
    }

    @Override
    public List findOne(Long id) {
       List list = new ArrayList<>();
        Productcategory productcategory = productcategoryMapper.selectByPrimaryKey(id);
        list.add(productcategory);
        return list;
    }
}
