package com.LeXiang.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Ordershipping implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private String address;

    private String area;

    private String consignee;

    private String deliverycorp;

    private String deliverycorpcode;

    private String deliverycorpurl;

    private BigDecimal freight;

    private String memo;

    private String phone;

    private String shippingmethod;

    private String sn;

    private String trackingno;

    private String zipcode;

    private Long orders;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getDeliverycorp() {
        return deliverycorp;
    }

    public void setDeliverycorp(String deliverycorp) {
        this.deliverycorp = deliverycorp == null ? null : deliverycorp.trim();
    }

    public String getDeliverycorpcode() {
        return deliverycorpcode;
    }

    public void setDeliverycorpcode(String deliverycorpcode) {
        this.deliverycorpcode = deliverycorpcode == null ? null : deliverycorpcode.trim();
    }

    public String getDeliverycorpurl() {
        return deliverycorpurl;
    }

    public void setDeliverycorpurl(String deliverycorpurl) {
        this.deliverycorpurl = deliverycorpurl == null ? null : deliverycorpurl.trim();
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getShippingmethod() {
        return shippingmethod;
    }

    public void setShippingmethod(String shippingmethod) {
        this.shippingmethod = shippingmethod == null ? null : shippingmethod.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getTrackingno() {
        return trackingno;
    }

    public void setTrackingno(String trackingno) {
        this.trackingno = trackingno == null ? null : trackingno.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }
}