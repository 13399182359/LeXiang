package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.pojo.Admin;

public interface AdminService {
    PageResult queryAdmin(Integer pageNum, Integer pageSize, Admin admin);

    void saveAdmin(Admin admin);

    void updAdmin(Admin admin);

    void delAdmin(Long[] ids);

    Admin findAdminById(Long id);
}
