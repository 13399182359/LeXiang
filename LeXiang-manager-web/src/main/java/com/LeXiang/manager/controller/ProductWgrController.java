package com.LeXiang.manager.controller;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.ProductWgrService;
import com.LeXiang.pojo.Product;
import com.LeXiang.pojo.ProductWithBLOBs;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: ProductWgrController
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-18 11:51
 **/
@RestController
@RequestMapping("wgrproduct")
public class ProductWgrController {
    @Reference(timeout = 6000)
    private ProductWgrService productWgrService;

    @RequestMapping("findProduct")
    public PageResult findProduct(Integer page, Integer rows, Product product){
        if(page==null){
            page=1;
        }
        if(rows==null){
            rows=50;
        }
        return productWgrService.findProduct(page,rows,product);
    }

    @RequestMapping("saveProduct")
    public Result saveProduct(ProductWithBLOBs product){
            try {
                productWgrService.saveProduct(product);
                return new Result(true,"入库成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(false,"入库失败");
            }

    }

    @RequestMapping("findProductById")
    public Product findProductById(Long id){
        return productWgrService.findProductById(id);
    }

    @RequestMapping("delProduct")
    public Result delProduct(Long[] ids){
            try {
                productWgrService.delProduct(ids);
                return new Result(true,"删除成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(false,"删除失败");
            }
    }

}
