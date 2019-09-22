package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.SysUserService;
import com.LeXiang.mapper.SysUserMapper;
import com.LeXiang.pojo.SysPermission;
import com.LeXiang.pojo.SysUser;
import com.LeXiang.pojo.SysUserExample;
import com.alibaba.dubbo.config.annotation.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findOne(String userCode) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        if (userCode != null && userCode.length() > 0) {
            criteria.andUsercodeEqualTo(userCode);
        }
        List<SysUser> sysUsers = sysUserMapper.selectByExample(example);

        if (sysUsers.size() > 0) {
            return sysUsers.get(0);
        }
        return null;
    }

    @Override
    public List<SysPermission> findMenusByUserId(String userId) {
        return sysUserMapper.findMenusByUserId(userId);
    }

    @Override
    public List<SysPermission> findPermissionsByUserId(String userId) {
        return null;
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectByExample(null);
    }
}
