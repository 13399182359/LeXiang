package com.LeXiang.pojo;

import java.io.Serializable;

public class Idgenerator implements Serializable {
    private String sequenceName;

    private Long nextVal;

    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName == null ? null : sequenceName.trim();
    }

    public Long getNextVal() {
        return nextVal;
    }

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }
}