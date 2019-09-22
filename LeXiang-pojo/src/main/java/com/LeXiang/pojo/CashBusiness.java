package com.LeXiang.pojo;

import java.io.Serializable;

public class CashBusiness  implements Serializable {

    private Cash cash;

    private Business business;

    public CashBusiness(Cash cash, Business business) {
        this.cash = cash;
        this.business = business;
    }

    public CashBusiness() {
    }

    @Override
    public String toString() {
        return "CashBusiness{" +
                "cash=" + cash +
                ", business=" + business +
                '}';
    }

    public Cash getCash() {
        return cash;
    }

    public void setCash(Cash cash) {
        this.cash = cash;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }
}
