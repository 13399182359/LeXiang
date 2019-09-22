package com.LeXiang.pojo;

import java.io.Serializable;
import java.util.Date;

public class Messageconfig implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private Boolean ismailenabled;

    private Boolean issmsenabled;

    private Integer type;

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

    public Boolean getIsmailenabled() {
        return ismailenabled;
    }

    public void setIsmailenabled(Boolean ismailenabled) {
        this.ismailenabled = ismailenabled;
    }

    public Boolean getIssmsenabled() {
        return issmsenabled;
    }

    public void setIssmsenabled(Boolean issmsenabled) {
        this.issmsenabled = issmsenabled;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}