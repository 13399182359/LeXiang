package com.LeXiang.Entity;

import com.LeXiang.pojo.Admin;
import com.LeXiang.pojo.Users;

import java.io.Serializable;

/**
 * @类名: AdminResult
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-17 15:47
 **/
public class AdminResult implements Serializable {

    private Admin admin;

    private Users users;


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

    public AdminResult() {
    }

    public AdminResult(Admin admin, Users users) {
        this.admin = admin;
        this.users = users;
    }
}
