package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.pojo.Ad;
import com.LeXiang.pojo.Adposition;

import java.util.List;

public interface AdService {
    PageResult queryAd(Integer page, Integer rows, Ad ad, Adposition adposition);

    Result deleteAd(long[] ids);

    Result updateAd(Ad ad);

    Ad queryAdById(long id);

    Result addAd(Ad ad);

    List<Adposition> queryadpostion();
}
