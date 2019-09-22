package com.LeXiang.manager.controller;


import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.AdService;
import com.LeXiang.pojo.Ad;
import com.LeXiang.pojo.Adposition;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ad")
public class AdController {
    @Reference
    private AdService adService;

    @RequestMapping("queryAd")
    public PageResult queryAd(Integer page, Integer rows, Ad ad, Adposition adposition){
        return  adService.queryAd(page,rows,ad,adposition);
    }

    @RequestMapping("deleteAd")
    public Result deleteAd(long [] ids){
        return  adService.deleteAd(ids);
    }

    @RequestMapping("updateAd")
    public  Result updateAd(Ad ad){
        return adService.updateAd(ad);
    }
    @RequestMapping("queryAdById")
    public  Ad queryAdById(long id){
        return adService.queryAdById(id);
    }
    @RequestMapping("add")
    public  Result addAd(Ad ad){
        return adService.addAd(ad);
    }

    @RequestMapping("queryadpostion")
    public List<Adposition> queryadpostion(){
        return adService.queryadpostion();
    }
}
