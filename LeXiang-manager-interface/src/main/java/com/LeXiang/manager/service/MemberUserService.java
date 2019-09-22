package com.LeXiang.manager.service;

import com.LeXiang.Entity.Result;
import com.LeXiang.pojo.Member;

public interface MemberUserService {
    Member queryUserByAccount(String username);

    Result register(Member member);
}
