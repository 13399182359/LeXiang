package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.pojo.Adposition;

public interface AdpositionService {
    PageResult queryAdposition(Integer page, Integer rows, Adposition adposition);

    Result deleteAdposition(long[] ids);

    Result updateAdposition(Adposition adposition);

    Adposition queryAdpositionById(long id);

    Result addAdposition(Adposition adposition);
}
