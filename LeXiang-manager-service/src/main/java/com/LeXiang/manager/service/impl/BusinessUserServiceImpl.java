package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.BusinessUserService;
import com.LeXiang.mapper.BusinessMapper;
import com.LeXiang.pojo.Business;
import com.LeXiang.pojo.BusinessExample;
import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.MemberExample;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class BusinessUserServiceImpl implements BusinessUserService {
    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public Business queryUserByAccount(String username) {

        Business business=null;
        BusinessExample businessExample=new BusinessExample();
        BusinessExample.Criteria criteria = businessExample.createCriteria();
        if(username!=null && username.length()>0){
            criteria.andUsernameEqualTo(username);
            List<Business> business1 = businessMapper.selectByExample(businessExample);
            business = business1.get(0);

            return business;
        }else {

            return  business;

        }
    }
}
