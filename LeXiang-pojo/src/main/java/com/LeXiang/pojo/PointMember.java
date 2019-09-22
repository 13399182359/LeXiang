package com.LeXiang.pojo;

import java.io.Serializable;

public class PointMember implements Serializable {


    private Pointlog pointlog;

    private  Member member;

    private Memberdepositlog memberdepositlog;

    private Product product;

    private Store store;

    private Review review;

    private Consultation consultation;

    private Ad ad;

    private  Adposition adposition;

    private Message message;

    private Memberrank memberrank;

    private  Orders orders;

    public PointMember(Member member, Store store, Review review, Memberrank memberrank, Orders orders) {
        this.member = member;
        this.store = store;
        this.review = review;
        this.memberrank = memberrank;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "PointMember{" +
                "pointlog=" + pointlog +
                ", member=" + member +
                ", memberdepositlog=" + memberdepositlog +
                ", product=" + product +
                ", store=" + store +
                ", review=" + review +
                ", consultation=" + consultation +
                ", ad=" + ad +
                ", adposition=" + adposition +
                ", message=" + message +
                ", memberrank=" + memberrank +
                ", orders=" + orders +
                '}';
    }

    public PointMember(Memberrank memberrank, Orders orders) {
        this.memberrank = memberrank;
        this.orders = orders;
    }

    public Memberrank getMemberrank() {
        return memberrank;
    }

    public void setMemberrank(Memberrank memberrank) {
        this.memberrank = memberrank;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public PointMember(Member member, Message message) {
        this.member = member;
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public PointMember(Ad ad, Adposition adposition) {
        this.ad = ad;
        this.adposition = adposition;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }

    public Adposition getAdposition() {
        return adposition;
    }

    public void setAdposition(Adposition adposition) {
        this.adposition = adposition;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public PointMember(Member member, Product product, Consultation consultation) {
        this.member = member;
        this.product = product;
        this.consultation = consultation;
    }

    public PointMember(Member member, Product product, Review review) {
        this.member = member;
        this.product = product;
        this.review = review;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public PointMember(Member member, Memberdepositlog memberdepositlog) {
        this.member = member;
        this.memberdepositlog = memberdepositlog;
    }



    public PointMember() {
    }

    public PointMember(Pointlog pointlog, Member member, Memberdepositlog memberdepositlog) {
        this.pointlog = pointlog;
        this.member = member;
        this.memberdepositlog = memberdepositlog;
    }

    public Memberdepositlog getMemberdepositlog() {
        return memberdepositlog;
    }

    public void setMemberdepositlog(Memberdepositlog memberdepositlog) {
        this.memberdepositlog = memberdepositlog;
    }

    public PointMember(Pointlog pointlog, Member member) {
        this.pointlog = pointlog;
        this.member = member;
    }

    public Pointlog getPointlog() {
        return pointlog;
    }

    public void setPointlog(Pointlog pointlog) {
        this.pointlog = pointlog;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
