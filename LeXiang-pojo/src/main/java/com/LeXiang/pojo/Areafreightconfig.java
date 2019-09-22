package com.LeXiang.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Areafreightconfig {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private BigDecimal continueprice;

    private Integer continueweight;

    private BigDecimal firstprice;

    private Integer firstweight;

    private Long shippingmethodId;

    private Long storeId;

    private Long areaId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Date getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(Date lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public BigDecimal getContinueprice() {
        return continueprice;
    }

    public void setContinueprice(BigDecimal continueprice) {
        this.continueprice = continueprice;
    }

    public Integer getContinueweight() {
        return continueweight;
    }

    public void setContinueweight(Integer continueweight) {
        this.continueweight = continueweight;
    }

    public BigDecimal getFirstprice() {
        return firstprice;
    }

    public void setFirstprice(BigDecimal firstprice) {
        this.firstprice = firstprice;
    }

    public Integer getFirstweight() {
        return firstweight;
    }

    public void setFirstweight(Integer firstweight) {
        this.firstweight = firstweight;
    }

    public Long getShippingmethodId() {
        return shippingmethodId;
    }

    public void setShippingmethodId(Long shippingmethodId) {
        this.shippingmethodId = shippingmethodId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }
}