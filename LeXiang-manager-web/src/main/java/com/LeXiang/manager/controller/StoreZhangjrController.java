package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.StoreZhangjrService;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Store;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/9 21:52
 * @Param
 * @return
 **/
@RequestMapping("store")
@RestController
public class StoreZhangjrController {
    @Reference(timeout = 60000)
    private StoreZhangjrService storeService;
    @RequestMapping("findAll")
    public ResultBean findAll(Integer page, Integer rows, Store storeBean){
        return storeService.findAll(storeBean,page,rows);
    }
    @RequestMapping("delete")
    public ResultBean delete(Long[] ids){
        try {
            storeService.delete(ids);
            return new ResultBean(true,"删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"删除失败！");
        }
    }
    @RequestMapping("addOrUpdate")
    public ResultBean addOrUpdate(Store storeBean){
        try {
            storeService.addOrUpdate(storeBean);
            return new ResultBean(true,"执行成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"执行失败！");
        }
    }
    @RequestMapping("findOne")
    public Store findOne(Long id){
        return storeService.findOne(id);
    }
}
