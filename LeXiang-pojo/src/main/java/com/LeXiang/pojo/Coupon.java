package com.LeXiang.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Coupon implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private Date begindate;

    private Date enddate;

    private Boolean isenabled;

    private Boolean isexchange;

    private BigDecimal maximumprice;

    private Integer maximumquantity;

    private BigDecimal minimumprice;

    private Integer minimumquantity;

    private String name;

    private Long point;

    private String prefix;

    private String priceexpression;

    private Long storeId;

    private String introduction;

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

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Boolean getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Boolean isenabled) {
        this.isenabled = isenabled;
    }

    public Boolean getIsexchange() {
        return isexchange;
    }

    public void setIsexchange(Boolean isexchange) {
        this.isexchange = isexchange;
    }

    public BigDecimal getMaximumprice() {
        return maximumprice;
    }

    public void setMaximumprice(BigDecimal maximumprice) {
        this.maximumprice = maximumprice;
    }

    public Integer getMaximumquantity() {
        return maximumquantity;
    }

    public void setMaximumquantity(Integer maximumquantity) {
        this.maximumquantity = maximumquantity;
    }

    public BigDecimal getMinimumprice() {
        return minimumprice;
    }

    public void setMinimumprice(BigDecimal minimumprice) {
        this.minimumprice = minimumprice;
    }

    public Integer getMinimumquantity() {
        return minimumquantity;
    }

    public void setMinimumquantity(Integer minimumquantity) {
        this.minimumquantity = minimumquantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    public String getPriceexpression() {
        return priceexpression;
    }

    public void setPriceexpression(String priceexpression) {
        this.priceexpression = priceexpression == null ? null : priceexpression.trim();
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}