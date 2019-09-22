package com.LeXiang.Entity;

import com.LeXiang.pojo.Product;
import com.LeXiang.pojo.Sku;
import com.LeXiang.pojo.Stocklog;

import java.io.Serializable;

/**
 * @类名: productResult
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-18 09:58
 **/
public class ProductResult implements Serializable {

    private Product product;

    private Stocklog stocklog;

    private Sku sku;

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public ProductResult(Product product, Stocklog stocklog, Sku sku) {
        this.product = product;
        this.stocklog = stocklog;
        this.sku = sku;
    }

    public ProductResult() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Stocklog getStocklog() {
        return stocklog;
    }

    public void setStocklog(Stocklog stocklog) {
        this.stocklog = stocklog;
    }

    public ProductResult(Product product, Stocklog stocklog) {
        this.product = product;
        this.stocklog = stocklog;
    }
}
