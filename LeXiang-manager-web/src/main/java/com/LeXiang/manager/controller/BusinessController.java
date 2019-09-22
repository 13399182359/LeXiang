package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.BusinessService;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Business;
import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/10 8:44
 * @Param
 * @return
 **/
@RequestMapping("business")
@RestController
public class BusinessController {
    @Reference(timeout =60000)
    private BusinessService businessService;
    @RequestMapping("findAll")
    public ResultBean findAll(Integer page, Integer rows, Business businessBean){
        return businessService.findAll(page,rows,businessBean);
    }
    @RequestMapping("findOne")
    public List findOne(Long id) {
        return businessService.findOne(id);
    }
    @RequestMapping("delete")
    public ResultBean delete(Long[] ids) {
        try {
            businessService.delete(ids);
            return new ResultBean(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"删除失败");
        }
    }
    @RequestMapping("addOrUpdate")
    public ResultBean addOrUpdate(Business businessBean) {
        try {
            Md5Hash md5Hash=new Md5Hash(businessBean.getEncodedpassword(),businessBean.getUsername(),1);
            String s = md5Hash.toString();
            businessBean.setEncodedpassword(s);

            businessService.addOrUpdate(businessBean);
            return new ResultBean(true,"执行成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"执行失败");
        }
    }

}
