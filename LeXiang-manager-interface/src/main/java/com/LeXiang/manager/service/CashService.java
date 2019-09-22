package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.pojo.Business;
import com.LeXiang.pojo.Cash;

public interface CashService {
    PageResult findCash(Integer page, Integer rows, Cash cash, Business business);

    Result deleteCash(Cash cash);
}
