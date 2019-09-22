package com.LeXiang.manager.controller;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.ReceiverWgrService;
import com.LeXiang.pojo.Receiver;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @类名: ReceiverWgrController
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-20 14:30
 **/
@RestController
@RequestMapping("receiverWgr")
public class ReceiverWgrController {

    @Reference(timeout = 6000)
    private ReceiverWgrService receiverWgrService;

    @RequestMapping("findReceiver")
    public PageResult findReceiver(Integer page, Integer rows, Receiver receiver){
        if(page==null){
            page=1;
        }
        if(rows==null){
            rows=20;
        }
        return receiverWgrService.findReceiver(page,rows,receiver);
    }

    @RequestMapping("saveReceiver")
    public Result saveReceiver(Receiver receiver){
        if(receiver.getId()==null){
            try {
                receiverWgrService.saveReceiver(receiver);
                return new Result(true,"新增成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(true,"新增失败");
            }
        }else{
            try {
                receiverWgrService.updReceiver(receiver);
                return new Result(true,"修改成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(true,"修改失败");
            }
        }

    }

    @RequestMapping("findReceiverById")
    public Receiver findReceiverById(Long id){
           return receiverWgrService.findReceiverById(id);
    }

    @RequestMapping("delReceiver")
    public Result delReceiver(Long id){
            try {
                receiverWgrService.delReceiver(id);
                return new Result(true,"删除成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(true,"删除失败");
            }
    }

    @RequestMapping("findAreaSheng")
    public List findAreaSheng(String treepath){
        return receiverWgrService.findAreaSheng(treepath);
    }

    @RequestMapping("findArea")
    public List findArea(Long parentId){
        return receiverWgrService.findArea(parentId);
    }


}
