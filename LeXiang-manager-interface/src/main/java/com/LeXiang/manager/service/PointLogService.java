package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.Pointlog;

import java.util.List;
import java.util.Map;

public interface PointLogService {
     Map<String, Object> queryMemberUserName(Member member);

    PageResult queryPoint(Integer page, Integer rows, Pointlog pointlog, Member member);

    Result deletePointLog(Pointlog pointlog);

    Result updatePoint(Pointlog pointlog,Member member);

    Map<String, Object> queryEcharts();

    List<Pointlog> findAll();

    void insert(List<Pointlog> pointlogs);
}
