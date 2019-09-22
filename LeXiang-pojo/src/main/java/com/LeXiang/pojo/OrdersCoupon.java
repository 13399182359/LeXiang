package com.LeXiang.pojo;

import java.io.Serializable;

public class OrdersCoupon implements Serializable {
    private Long ordersId;

    private Long couponsId;

    public Long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Long ordersId) {
        this.ordersId = ordersId;
    }

    public Long getCouponsId() {
        return couponsId;
    }

    public void setCouponsId(Long couponsId) {
        this.couponsId = couponsId;
    }
}