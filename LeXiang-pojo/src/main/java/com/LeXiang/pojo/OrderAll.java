package com.LeXiang.pojo;

import java.io.Serializable;

public class OrderAll implements Serializable {

    private Orders orders;

    private Store store;

    private Member member;

    private Memberrank memberrank;

    private Business business;

    public OrderAll(Orders orders) {
        this.orders = orders;
    }

    public OrderAll(Orders orders, Store store, Member member, Memberrank memberrank, Business business) {
        this.orders = orders;
        this.store = store;
        this.member = member;
        this.memberrank = memberrank;
        this.business = business;
    }

    @Override
    public String toString() {
        return "OrderAll{" +
                "orders=" + orders +
                ", store=" + store +
                ", member=" + member +
                ", memberrank=" + memberrank +
                ", business=" + business +
                '}';
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Memberrank getMemberrank() {
        return memberrank;
    }

    public void setMemberrank(Memberrank memberrank) {
        this.memberrank = memberrank;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }
}
