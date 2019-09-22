package com.LeXiang.manager.controller;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.FriendLinkService;
import com.LeXiang.pojo.Friendlink;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: FriendLinkController
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-16 19:38
 **/
@RestController
@RequestMapping("friendLink")
public class FriendLinkController {
    @Reference(timeout = 6000)
    private FriendLinkService friendLinkService;

    @RequestMapping("findFriendLink")
    public PageResult findFriendLink(Integer page, Integer rows, Friendlink friendlink) {
        if(page==null){
            page=1;
        }
        if(rows==null){
            rows=3;
        }
        return friendLinkService.findFriendLink(page,rows,friendlink);
    }

    @RequestMapping("saveFriendLink")
    public Result saveFriendLink(Friendlink friendlink){
        if(friendlink.getId()==null){
            try {
                friendLinkService.saveFriendLink(friendlink);
                return new Result(true,"新增成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(true,"新增失败");
            }
        }else{
            try {

                friendLinkService.updFriendLink(friendlink);
                return new Result(true,"修改成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(true,"修改失败");
            }
        }

    }

    @RequestMapping("delFriendLink")
    public Result delFriendLink(Long[] ids){
        try {
            friendLinkService.delFriendLink(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true,"删除失败");
        }
    }

    @RequestMapping("findFriendLinkById")
    public Friendlink findFriendLinkById(long id){
            return friendLinkService.findFriendLinkById(id);
    }
}
