package com.LeXiang.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Orderitem implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private BigDecimal commissiontotals;

    private Boolean isdelivery;

    private String name;

    private BigDecimal price;

    private Integer quantity;

    private Integer returnedquantity;

    private Integer shippedquantity;

    private String sn;

    private String thumbnail;

    private Integer type;

    private Integer weight;

    private Long orders;

    private Long skuId;

    private String specifications;

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

    public BigDecimal getCommissiontotals() {
        return commissiontotals;
    }

    public void setCommissiontotals(BigDecimal commissiontotals) {
        this.commissiontotals = commissiontotals;
    }

    public Boolean getIsdelivery() {
        return isdelivery;
    }

    public void setIsdelivery(Boolean isdelivery) {
        this.isdelivery = isdelivery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getReturnedquantity() {
        return returnedquantity;
    }

    public void setReturnedquantity(Integer returnedquantity) {
        this.returnedquantity = returnedquantity;
    }

    public Integer getShippedquantity() {
        return shippedquantity;
    }

    public void setShippedquantity(Integer shippedquantity) {
        this.shippedquantity = shippedquantity;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }
}