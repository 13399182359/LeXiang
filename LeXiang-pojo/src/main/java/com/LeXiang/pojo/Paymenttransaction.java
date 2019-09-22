package com.LeXiang.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Paymenttransaction implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private BigDecimal amount;

    private Date expire;

    private BigDecimal fee;

    private Boolean issuccess;

    private String paymentpluginid;

    private String paymentpluginname;

    private String sn;

    private Integer type;

    private Long orders;

    private Long parentId;

    private Long storeId;

    private Long svcId;

    private Long userId;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Boolean getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(Boolean issuccess) {
        this.issuccess = issuccess;
    }

    public String getPaymentpluginid() {
        return paymentpluginid;
    }

    public void setPaymentpluginid(String paymentpluginid) {
        this.paymentpluginid = paymentpluginid == null ? null : paymentpluginid.trim();
    }

    public String getPaymentpluginname() {
        return paymentpluginname;
    }

    public void setPaymentpluginname(String paymentpluginname) {
        this.paymentpluginname = paymentpluginname == null ? null : paymentpluginname.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getSvcId() {
        return svcId;
    }

    public void setSvcId(Long svcId) {
        this.svcId = svcId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}