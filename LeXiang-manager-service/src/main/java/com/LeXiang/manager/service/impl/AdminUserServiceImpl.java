package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.AdminUserService;
import com.LeXiang.mapper.AdminMapper;
import com.LeXiang.pojo.Admin;
import com.LeXiang.pojo.AdminExample;
import com.LeXiang.pojo.Business;
import com.LeXiang.pojo.BusinessExample;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin queryUserByAccount(String username) {

        Admin admin=null;
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        if(username!=null && username.length()>0){
            criteria.andUsernameEqualTo(username);
            List<Admin> admins = adminMapper.selectByExample(adminExample);
            admin = admins.get(0);

            return admin;
        }else {

            return  admin;

        }
    }


}
