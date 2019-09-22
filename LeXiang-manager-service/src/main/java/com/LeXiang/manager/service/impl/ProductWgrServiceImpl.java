package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.ProductResult;
import com.LeXiang.manager.service.ProductWgrService;
import com.LeXiang.mapper.ProductMapper;
import com.LeXiang.mapper.SkuMapper;
import com.LeXiang.mapper.StocklogMapper;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


/**
 * @类名: ProductWgrServiceImpl
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-18 11:53
 **/
@Service(timeout = 6000)
public class ProductWgrServiceImpl implements ProductWgrService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private SkuMapper skuMapper;
    @Autowired
    private StocklogMapper stocklogMapper;
    @Override
    public PageResult findProduct(Integer pageNum, Integer pageSize, Product product) {
        PageHelper.startPage(pageNum,pageSize);
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        if(product!=null){
            if(product.getStoreId()!=null){
                criteria.andStoreIdEqualTo(product.getStoreId());
            }
            if(product.getName()!=null && product.getName().length()>0){
                criteria.andNameLike("%"+product.getName()+"%");
            }
        }
        List<Product> products = productMapper.selectByExample(productExample);

        ArrayList<ProductResult> productResults = new ArrayList<>();
        for (Product product1 : products) {
            Sku sku = skuMapper.selectByPrimaryKey(product1.getId());
            Stocklog stocklog = stocklogMapper.selectByPrimaryKey(sku.getId());
            ProductResult productResult = new ProductResult(product1, stocklog, sku);
            productResults.add(productResult);
        }
        long totalPage = (long) (Math.ceil(productResults.size() / pageSize) + 1);
        return new PageResult(productResults.size(), productResults, pageNum, pageSize, totalPage);

    }

    @Override
    public void saveProduct(ProductWithBLOBs product) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        if(product!=null){
            if(product.getName()!=null && product.getName().length()>0){
                criteria.andNameLike("%"+product.getName()+"%");
            }
            Product product1 = productMapper.selectByExample(productExample).get(0);
            product1.setMemo(product.getMemo());
            productMapper.updateByPrimaryKey(product1);

          /*  Sku sku = skuMapper.selectByPrimaryKey(product1.getId());
            Stocklog stocklog = stocklogMapper.selectByPrimaryKey(sku.getId());
            int i = Integer.parseInt(product.getAttributevalue0());
            stocklog.setStock(i+stocklog.getStock());

            stocklogMapper.updateByPrimaryKey(stocklog);*/
        }

    }

    @Override
    public void updProduct(Product product) {
        productMapper.updateByPrimaryKey(product);
    }

    @Override
    public Product findProductById(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delProduct(Long[] ids) {
        for (Long id : ids) {
            productMapper.deleteByPrimaryKey(id);
        }

    }
}
