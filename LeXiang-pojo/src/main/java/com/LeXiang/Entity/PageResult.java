package com.LeXiang.Entity;

import java.io.Serializable;
import java.util.List;

/**
 * @类名: PageResult
 * @描述:
 * @作者: 姚文华
 * @时间: 2019-09-03 15:34
 **/
public class PageResult implements Serializable {
    private long total;

    private List rows;

    private Integer pageNum;

    private Integer pageSize;

    private long totalPage;

    public PageResult() {
    }

    public PageResult(long total, List rows, Integer pageNum, Integer pageSize, long totalPage) {
        this.total = total;
        this.rows = rows;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", rows=" + rows +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                '}';
    }
}

