package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.TreeService;
import com.LeXiang.mapper.entity.ResultBean;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/17 8:50
 * @Param
 * @return
 **/
@RequestMapping("tree")
@RestController
public class TreeController {
    @Reference(timeout = 60000)
    private TreeService treeService;

    @RequestMapping("findAll")
    public ResultBean findAll(Integer id){
        ResultBean all = treeService.findAll(id);
        System.out.println(all);
        return all;
    }
    @RequestMapping("findWhere")
    public List findWhere(){
        return treeService.findWhere();
    }
}
