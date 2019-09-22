package com.LeXiang.manager.service;

import com.LeXiang.pojo.SysPermission;
import com.LeXiang.pojo.SysUser;

import java.util.List;

public interface SysUserService {
    List<SysPermission> findPermissionsByUserId(String userid);

    SysUser findOne(String userCode);

    List<SysPermission> findMenusByUserId(String id);
    public List<SysUser> findAll();
}
