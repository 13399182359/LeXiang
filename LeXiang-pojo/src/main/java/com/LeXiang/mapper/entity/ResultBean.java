package com.LeXiang.mapper.entity;

import com.LeXiang.pojo.*;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/9 19:38
 * @Param
 * @return
 **/
@Data
@ToString
public class ResultBean implements Serializable {
    private Integer page;
    private Integer total;
    private List rows;
    private Boolean success;
    private String message;
    private String where;
    private Store store;
    private Business business;
    private Integer dangPage;
    private Integer sumPage;
    private Integer meiPageCount;
    private Orders orders;
    private Shippingmethod shippingmethod;
    private Deliverycorp deliverycorp;
    private Paymentmethod paymentmethod;
    private Orderpayment orderpayment;
    private Memberrank memberrank;
    private Promotion promotion;
    private TTree TTree;

    private Seo seo;
    private Coupon coupon;
    private Sku sku;
    private ProductWithBLOBs productWithBLOBs;
    public ResultBean() {
    }

    public com.LeXiang.pojo.TTree getTTree() {
        return TTree;
    }

    public void setTTree(com.LeXiang.pojo.TTree TTree) {
        this.TTree = TTree;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "page=" + page +
                ", total=" + total +
                ", rows=" + rows +
                ", success=" + success +
                ", message='" + message + '\'' +
                ", where='" + where + '\'' +
                ", store=" + store +
                ", business=" + business +
                ", dangPage=" + dangPage +
                ", sumPage=" + sumPage +
                ", meiPageCount=" + meiPageCount +
                ", orders=" + orders +
                ", shippingmethod=" + shippingmethod +
                ", deliverycorp=" + deliverycorp +
                ", paymentmethod=" + paymentmethod +
                ", orderpayment=" + orderpayment +
                ", memberrank=" + memberrank +
                ", promotion=" + promotion +
                ", seo=" + seo +
                ", coupon=" + coupon +
                ", sku=" + sku +
                ", productWithBLOBs=" + productWithBLOBs +
                '}';
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Integer getDangPage() {
        return dangPage;
    }

    public void setDangPage(Integer dangPage) {
        this.dangPage = dangPage;
    }

    public Integer getSumPage() {
        return sumPage;
    }

    public void setSumPage(Integer sumPage) {
        this.sumPage = sumPage;
    }

    public Integer getMeiPageCount() {
        return meiPageCount;
    }

    public void setMeiPageCount(Integer meiPageCount) {
        this.meiPageCount = meiPageCount;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Shippingmethod getShippingmethod() {
        return shippingmethod;
    }

    public void setShippingmethod(Shippingmethod shippingmethod) {
        this.shippingmethod = shippingmethod;
    }

    public Deliverycorp getDeliverycorp() {
        return deliverycorp;
    }

    public void setDeliverycorp(Deliverycorp deliverycorp) {
        this.deliverycorp = deliverycorp;
    }

    public Paymentmethod getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(Paymentmethod paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public Orderpayment getOrderpayment() {
        return orderpayment;
    }

    public void setOrderpayment(Orderpayment orderpayment) {
        this.orderpayment = orderpayment;
    }

    public Memberrank getMemberrank() {
        return memberrank;
    }

    public void setMemberrank(Memberrank memberrank) {
        this.memberrank = memberrank;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public Seo getSeo() {
        return seo;
    }

    public void setSeo(Seo seo) {
        this.seo = seo;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public ProductWithBLOBs getProductWithBLOBs() {
        return productWithBLOBs;
    }

    public void setProductWithBLOBs(ProductWithBLOBs productWithBLOBs) {
        this.productWithBLOBs = productWithBLOBs;
    }

    public ResultBean(Integer total, List rows, Integer dangPage, Integer sumPage, Integer meiPageCounr) {
        this.total = total;
        this.rows = rows;
        this.dangPage = dangPage;
        this.sumPage = sumPage;
        this.meiPageCount = meiPageCounr;
    }

    public ResultBean(Integer total, List rows, Store store, Business business) {
        this.total = total;
        this.rows = rows;
        this.store = store;
        this.business = business;
    }

    public ResultBean(Integer total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public ResultBean(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
