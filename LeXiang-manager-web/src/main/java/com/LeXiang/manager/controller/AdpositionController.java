package com.LeXiang.manager.controller;


import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.AdpositionService;
import com.LeXiang.pojo.Adposition;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("adposition")
public class AdpositionController {
    @Reference
    private AdpositionService adpositionService;

    @RequestMapping("queryAdposition")
    public PageResult queryAdposition(Integer page,Integer rows,Adposition adposition){
        return  adpositionService.queryAdposition(page,rows,adposition);
    }

    @RequestMapping("deleteAdposition")
    public Result deleteAdposition(long [] ids){
        return  adpositionService.deleteAdposition(ids);
    }

    @RequestMapping("updateAdposition")
    public  Result updateAdposition(Adposition adposition){
        return adpositionService.updateAdposition(adposition);
    }
    @RequestMapping("queryAdpositionById")
    public  Adposition queryAdpositionById(long id){
        return adpositionService.queryAdpositionById(id);
    }
    @RequestMapping("add")
    public  Result addAdposition(Adposition adposition){
        return adpositionService.addAdposition(adposition);
    }
}
