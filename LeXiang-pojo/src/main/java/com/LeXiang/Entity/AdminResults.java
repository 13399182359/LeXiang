package com.LeXiang.Entity;

import com.LeXiang.pojo.Admin;
import com.LeXiang.pojo.AdminRoleKey;
import com.LeXiang.pojo.Users;

import java.io.Serializable;

/**
 * @类名: AdminResult
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-17 15:47
 **/
public class AdminResults implements Serializable {

    private Admin admin;

    private Users users;

    private AdminRoleKey adminRoleKey;

    public AdminResults() {
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public AdminRoleKey getAdminRoleKey() {
        return adminRoleKey;
    }

    public void setAdminRoleKey(AdminRoleKey adminRoleKey) {
        this.adminRoleKey = adminRoleKey;
    }

    public AdminResults(Admin admin, Users users, AdminRoleKey adminRoleKey) {
        this.admin = admin;
        this.users = users;
        this.adminRoleKey = adminRoleKey;
    }
}
