package com.LeXiang.manager.service;

import com.LeXiang.pojo.Business;

public interface BusinessUserService {
    Business queryUserByAccount(String username);
}
