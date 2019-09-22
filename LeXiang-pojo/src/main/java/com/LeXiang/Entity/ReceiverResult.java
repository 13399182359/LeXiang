package com.LeXiang.Entity;

import com.LeXiang.pojo.Area;
import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.Receiver;

import java.io.Serializable;

/**
 * @类名: ReceiverResult
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-20 14:32
 **/
public class ReceiverResult implements Serializable {

    private Receiver receiver;

    private Area area;

    private Member member;

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public ReceiverResult() {
    }

    public ReceiverResult(Receiver receiver, Area area, Member member) {
        this.receiver = receiver;
        this.area = area;
        this.member = member;
    }
}
