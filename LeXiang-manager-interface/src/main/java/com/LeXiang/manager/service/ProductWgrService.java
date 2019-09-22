package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.pojo.Product;
import com.LeXiang.pojo.ProductWithBLOBs;

public interface ProductWgrService {
    PageResult findProduct(Integer pageNum, Integer pageSize, Product product);

    void saveProduct(ProductWithBLOBs product);

    void updProduct(Product product);

    Product findProductById(Long id);

    void delProduct(Long[] ids);
}
