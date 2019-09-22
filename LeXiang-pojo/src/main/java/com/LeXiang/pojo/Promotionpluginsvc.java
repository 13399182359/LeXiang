package com.LeXiang.pojo;

public class Promotionpluginsvc {
    private Long id;

    private String promotionpluginid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPromotionpluginid() {
        return promotionpluginid;
    }

    public void setPromotionpluginid(String promotionpluginid) {
        this.promotionpluginid = promotionpluginid == null ? null : promotionpluginid.trim();
    }
}