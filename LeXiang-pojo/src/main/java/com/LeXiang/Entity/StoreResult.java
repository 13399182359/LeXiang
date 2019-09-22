package com.LeXiang.Entity;

import com.LeXiang.pojo.Business;
import com.LeXiang.pojo.Store;
import com.LeXiang.pojo.Storecategory;
import com.LeXiang.pojo.Storerank;

import java.io.Serializable;

/**
 * @类名: StoreResult
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-11 09:32
 **/
public class StoreResult implements Serializable {

    private Business business;

    private Store store;

    private Storecategory storecategory;

    private Storerank storerank;

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Storecategory getStorecategory() {
        return storecategory;
    }

    public void setStorecategory(Storecategory storecategory) {
        this.storecategory = storecategory;
    }

    public Storerank getStorerank() {
        return storerank;
    }

    public void setStorerank(Storerank storerank) {
        this.storerank = storerank;
    }

    public StoreResult(Store store1, Storecategory storecategory) {
    }

    public StoreResult(Business business, Store store, Storecategory storecategory, Storerank storerank) {
        this.business = business;
        this.store = store;
        this.storecategory = storecategory;
        this.storerank = storerank;
    }
}
