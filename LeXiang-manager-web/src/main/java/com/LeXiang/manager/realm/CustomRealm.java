package com.LeXiang.manager.realm;

import com.LeXiang.Entity.ActiveUser;
import com.LeXiang.manager.service.SysUserService;

import com.LeXiang.pojo.SysPermission;
import com.LeXiang.pojo.SysUser;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.ArrayList;
import java.util.List;

public class CustomRealm extends AuthorizingRealm  {

    private SysUserService sysUserService;

    public SysUserService getSysUserService() {
        return sysUserService;
    }

    public void setSysUserService(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }

    /**
     * 授权器
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        //获得用户信息
        ActiveUser activeUser = (ActiveUser) principals.getPrimaryPrincipal();
        //通过用户id获得用户拥有的所有权限信息
        List<SysPermission> permissions = sysUserService.findPermissionsByUserId(activeUser.getUserid());
        List<String> list = new ArrayList<String>();
        for (SysPermission permission : permissions) {
            list.add(permission.getPercode());
        }
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(list);
        return simpleAuthorizationInfo;
    }

    /**
     * 认证器
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获得用户名
        String userCode = (String) token.getPrincipal();

        //从数据库中获得用户信息
        SysUser sysUser = sysUserService.findOne(userCode);
        // 如果账号不存在
        if (sysUser == null) {
            return null;
        }
        ActiveUser activeUser = new ActiveUser();
        activeUser.setUserid(sysUser.getId());
        activeUser.setUsercode(sysUser.getUsercode());
        activeUser.setUsername(sysUser.getUsername());

        Md5Hash md5Hash=new Md5Hash("123","uiwueylm",1);




        List<SysPermission> menus = null;
        try {
            //通过用户id获得用户的左侧菜单信息
            menus = sysUserService.findMenusByUserId(sysUser.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        activeUser.setMenus(menus);
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(activeUser, sysUser.getPassword(), ByteSource.Util.bytes(sysUser.getSalt()), this.getName());
        return simpleAuthenticationInfo;
    }
}
