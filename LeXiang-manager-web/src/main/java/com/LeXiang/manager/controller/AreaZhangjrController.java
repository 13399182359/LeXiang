package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.AreaZhangjrService;
import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.Receiver;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/21 15:13
 * @Param
 * @return
 **/
@RequestMapping("areaZhangjr")
@RestController
public class AreaZhangjrController {
    @Reference(timeout = 60000)
    private AreaZhangjrService areaZhangjrService;
    @RequestMapping("findWhere")
    public List findWhere(Long id) {
        return areaZhangjrService.findWhere(id);
    }
    @RequestMapping("addArea")
    public Receiver addArea(Receiver receiver, HttpServletRequest request) {
        Member member = (Member) request.getSession().getAttribute("MEMBER_KEY" + request.getSession().getId());
        if (member!=null) {
            receiver.setMemberId(member.getId());
        }
        return areaZhangjrService.addArea(receiver);
    }
}
