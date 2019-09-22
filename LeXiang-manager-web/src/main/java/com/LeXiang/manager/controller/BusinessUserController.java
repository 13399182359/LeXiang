package com.LeXiang.manager.controller;

import com.LeXiang.Commons;
import com.LeXiang.manager.service.BusinessUserService;
import com.LeXiang.pojo.Business;
import com.LeXiang.pojo.Member;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("businessuser")
public class BusinessUserController {
    @Reference
    private BusinessUserService businessService;
    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @RequestMapping("login")
    public Map login (Business user, HttpSession session, Integer checkImg){
        HashMap<String,Object> map = new HashMap<String,Object>();
        Integer imgcode = (Integer)session.getAttribute(Commons.SHOPKEY+"imgcode");

        if(imgcode==null || checkImg==null || checkImg.equals("")){
            map.put("code", -1);
            map.put("msg", "验证码错误");
            return map;
        }
        if(checkImg!=imgcode){
            map.put("code", 4);
            map.put("msg", "验证码错误");
            return map;
        }

        Business userWebBean = businessService.queryUserByAccount(user.getUsername());
        if(userWebBean==null){
            map.put("code", 2);
            map.put("msg", "账号不存在");
            return map;
        }
        if(!userWebBean.getUsername().equals(user.getUsername())){
            map.put("code", 2);
            map.put("msg", "账号不存在");
            return map;
        }
        Md5Hash md5Hash=new Md5Hash(user.getEncodedpassword(),user.getUsername(),1);
        String s = md5Hash.toString();
        System.out.println(s);

        if(!userWebBean.getEncodedpassword().equals(s)){
            map.put("code", 3);
            map.put("msg", "账号/密码不匹配");
            return map;
        }

        session.setAttribute(Commons.SHOPKEY+session.getId(), userWebBean);

        map.put("code", 0);
        map.put("msg", "登录成功");
        String  cacheKey =userWebBean.getUsername();
        String s1 = JSON.toJSONString(userWebBean);
        // redisTemplate.delete(cacheKey)
        redisTemplate.opsForValue().set(cacheKey,s1);
        return map;
    }

}
