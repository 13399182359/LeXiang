package com.LeXiang.manager.service;

import com.LeXiang.Entity.MemberResult;
import com.LeXiang.Entity.PageResult;
import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.Memberattribute;
import com.LeXiang.pojo.Memberrank;

import java.util.List;

public interface MemberService {

    void addMember(Member member);

    void editMember(Member member);

    MemberResult toUpdMember(Long id);

    void delMember(Long[] ids);

    PageResult findMember(Integer pageNum, Integer pageSize, Member member);

    PageResult findMemberRank(Integer pageNum, Integer pageSize, Memberrank memberrank);

    void addMemberRank(Memberrank memberrank);

    void editMemberRank(Memberrank memberrank);

    Memberrank toUpdMemberRank(Long id);

    void delMembeRank(Long[] ids);

    PageResult findMemberAtt(Integer pageNum, Integer pageSize, Memberattribute memberattribute);

    void addMemberAtt(Memberattribute memberattribute);

    void editMemberAtt(Memberattribute memberattribute);

    Memberattribute toUpdMemberAtt(Long id);

    void delMembeAtt(Long[] ids);


    List<Memberrank> findAll();

}

