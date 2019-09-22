package com.LeXiang.Entity;

import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.Memberrank;
import com.LeXiang.pojo.Users;

import java.io.Serializable;

/**
 * @类名: MemberS
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-09 20:05
 **/
public class MemberResult implements Serializable {

    private Member member;

    private Memberrank memberrank;

    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public MemberResult(Member member, Memberrank memberrank, Users users) {
        this.member = member;
        this.memberrank = memberrank;
        this.users = users;
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

    public MemberResult() {
    }

    public MemberResult(Member member, Memberrank memberrank) {
        this.member = member;
        this.memberrank = memberrank;
    }
}
