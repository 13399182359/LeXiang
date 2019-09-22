package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.AdminResult;
import com.LeXiang.Entity.PageResult;
import com.LeXiang.manager.service.AdminService;
import com.LeXiang.mapper.AdminMapper;
import com.LeXiang.mapper.AdminRoleMapper;
import com.LeXiang.mapper.UsersMapper;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @类名: AdminServiceImpl
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-17 15:30
 **/
@Service(timeout = 6000)
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private AdminRoleMapper adminRoleMapper;

    @Override
    public PageResult queryAdmin(Integer pageNum, Integer pageSize, Admin admin) {
        PageHelper.startPage(pageNum,pageSize);
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        if(admin!=null){
            if(admin.getUsername()!=null && admin.getUsername().length()>0){
                criteria.andUsernameLike("%"+admin.getUsername()+"%");
            }
        }
        
        AdminRoleExample adminRoleExample = new AdminRoleExample();
        AdminRoleExample.Criteria criteria1 = adminRoleExample.createCriteria();
        if(admin.getId()!=null){
            criteria1.andAdminsIdEqualTo(admin.getId());
        }
        List<AdminRoleKey> adminRoleKeys = adminRoleMapper.selectByExample(adminRoleExample);
        Users users=new Users();
        for (AdminRoleKey adminRoleKey : adminRoleKeys) {
            users = usersMapper.selectByPrimaryKey(adminRoleKey.getRolesId());
        }

        ArrayList<AdminResult> adminResults = new ArrayList<>();
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        for (Admin admin1 : admins) {
            AdminResult adminResult = new AdminResult(admin1,users);
            adminResults.add(adminResult);
        }
        long totalPage = (long) (Math.ceil(adminResults.size() / pageSize) + 1);
        return new PageResult(adminResults.size(), adminResults, pageNum, pageSize, totalPage);
    }

    @Override
    public void saveAdmin(Admin admin) {
        insert(admin);


     /*   String username = admin.getUsername();
        Long adminid = query(username);
        if(adminid!=null){
            AdminRoleKey adminRoleKey = new AdminRoleKey();
            long a=1;
            adminRoleKey.setAdminsId(adminid);
            adminRoleKey.setRolesId(a);
            adminRoleMapper.insert(adminRoleKey);

            Users users = new Users();
            users.setCreateddate(new Date());
            users.setId(adminid);
            users.setLastlogindate(new Date());
            users.setIsenabled(true);
            usersMapper.insert(users);
        }

*/
    }
    private void insert(Admin admin){
        adminMapper.insert(admin);
    }
    private Long query(String username){
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        Admin admins = (Admin) adminMapper.selectByExample(adminExample);
        return admins.getId();
    }

    @Override
    public void updAdmin(Admin admin) {
        adminMapper.updateByPrimaryKey(admin);
    }

    @Override
    public void delAdmin(Long[] ids) {
        for (Long id : ids) {
            adminMapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public Admin findAdminById(Long id) {
       /* AdminRoleExample adminRoleExample = new AdminRoleExample();
        AdminRoleExample.Criteria criteria1 = adminRoleExample.createCriteria();
        criteria1.andAdminsIdEqualTo(id);
        AdminRoleKey adminRoleKeys = (AdminRoleKey) adminRoleMapper.selectByExample(adminRoleExample);
*/
        return adminMapper.selectByPrimaryKey(id);
    }
}
