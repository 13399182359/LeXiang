package com.LeXiang.manager.controller;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.AdminService;
import com.LeXiang.pojo.Admin;
import com.LeXiang.pojo.Role;
import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: AdminController
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-17 15:30
 **/
@RestController
@RequestMapping("admin")
public class AdminController {
    @Reference
    private AdminService adminService;

    @RequestMapping("queryAdmin")
    public PageResult queryAdmin(Integer page, Integer rows, Admin admin){
        if(page==null){
            page=1;
        }
        if(rows==null){
            rows=3;
        }
        return adminService.queryAdmin(page,rows,admin);
    }

    @RequestMapping("saveAdmin")
    public Result saveAdmin(Admin admin, Role role){
        if(admin.getId()==null){
            try {
                Md5Hash md5Hash=new Md5Hash(admin.getEncodedpassword(),admin.getUsername(),1);
                String s = md5Hash.toString();
                admin.setEncodedpassword(s);


                adminService.saveAdmin(admin);
                return new Result(true,"新增成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new Result(false,"新增失败");
        }else{
            try {
                Md5Hash md5Hash=new Md5Hash(admin.getEncodedpassword(),admin.getUsername(),1);
                String s = md5Hash.toString();
                admin.setEncodedpassword(s);


                adminService.updAdmin(admin);
                return new Result(true,"修改成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("delAdmin")
    public Result delAdmin(Long[] ids){
        try {
            adminService.delAdmin(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"删除失败");
    }

    @RequestMapping("findAdminById")
    public Admin findAdminById(Long id){
          return adminService.findAdminById(id);
    }

}
