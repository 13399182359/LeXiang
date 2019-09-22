package com.LeXiang.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Promotion implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private Integer orders;

    private Date begindate;

    private BigDecimal conditionsamount;

    private Integer conditionsnumber;

    private BigDecimal creditamount;

    private Integer creditnumber;

    private Double discount;

    private Date enddate;

    private String image;

    private Boolean iscouponallowed;

    private Boolean isenabled;

    private Boolean isfreeshipping;

    private BigDecimal maximumprice;

    private Integer maximumquantity;

    private BigDecimal minimumprice;

    private Integer minimumquantity;

    private String name;

    private String priceexpression;

    private String title;

    private Integer type;

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

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public BigDecimal getConditionsamount() {
        return conditionsamount;
    }

    public void setConditionsamount(BigDecimal conditionsamount) {
        this.conditionsamount = conditionsamount;
    }

    public Integer getConditionsnumber() {
        return conditionsnumber;
    }

    public void setConditionsnumber(Integer conditionsnumber) {
        this.conditionsnumber = conditionsnumber;
    }

    public BigDecimal getCreditamount() {
        return creditamount;
    }

    public void setCreditamount(BigDecimal creditamount) {
        this.creditamount = creditamount;
    }

    public Integer getCreditnumber() {
        return creditnumber;
    }

    public void setCreditnumber(Integer creditnumber) {
        this.creditnumber = creditnumber;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Boolean getIscouponallowed() {
        return iscouponallowed;
    }

    public void setIscouponallowed(Boolean iscouponallowed) {
        this.iscouponallowed = iscouponallowed;
    }

    public Boolean getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Boolean isenabled) {
        this.isenabled = isenabled;
    }

    public Boolean getIsfreeshipping() {
        return isfreeshipping;
    }

    public void setIsfreeshipping(Boolean isfreeshipping) {
        this.isfreeshipping = isfreeshipping;
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

    public String getPriceexpression() {
        return priceexpression;
    }

    public void setPriceexpression(String priceexpression) {
        this.priceexpression = priceexpression == null ? null : priceexpression.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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