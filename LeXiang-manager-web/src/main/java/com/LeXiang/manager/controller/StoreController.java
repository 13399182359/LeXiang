package com.LeXiang.manager.controller;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.StoreService;
import com.LeXiang.pojo.Business;
import com.LeXiang.pojo.Store;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @类名: StoreController
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-11 14:52
 **/
@RestController
@RequestMapping("store")
public class StoreController {
    @Reference(timeout = 6000)
    private StoreService storeService;


    @RequestMapping("findStore")
    public PageResult findStore(Integer page, Integer rows, Store store){
        if(page==null){
            page=1;
        }
        if(rows==null){
            rows=3;
        }
        return storeService.findStore(page,rows,store);
    }

    @RequestMapping("saveStore")
    public Result saveStore(Store store){
    if(store.getId()==null){
        try {
            storeService.saveStore(store);
            return new Result(true,"新增成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true,"新增失败");
        }
    }else{
        try {
            storeService.updStore(store);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true,"修改失败");
        }
    }

    }

    @RequestMapping("findStoreById")
    public Store findStoreById(Long id){
        return storeService.findStoreById(id);
    }

    @RequestMapping("delStore")
    public Result delStore(Long[] ids){

        try {
            storeService.delStore(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"删除失败");
    }
    @RequestMapping("findBusinessById")
    public List<Business> findBusinessById(){
        return  storeService.findBusinessById();
    }
}
