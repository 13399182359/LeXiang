package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.Memberdepositlog;

import java.util.List;
import java.util.Map;

public interface MemberDepositService {

    PageResult queryMemberdepositlog(Integer page, Integer rows, Memberdepositlog memberdepositlog, Member member);

    Result deleteMemberdepositlog(Memberdepositlog memberdepositlog);

    Result updateMemberdepositlog(Memberdepositlog memberdepositlog, Member member);

    Map<String, Object> queryMemberUserName(Member member);

    List<Memberdepositlog> findAll();

    void insert(List<Memberdepositlog> pointlogs);

    Map<String, Object> queryEcharts();
}
