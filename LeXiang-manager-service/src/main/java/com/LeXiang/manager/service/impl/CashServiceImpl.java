package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.CashService;
import com.LeXiang.mapper.BusinessMapper;
import com.LeXiang.mapper.CashMapper;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @类名: CashServiceImpl
 * @描述:
 * @作者: 姚文华
 * @时间: 2019-09-10 23:52
 **/
@Service
public class CashServiceImpl implements CashService {
    @Autowired
    private CashMapper cashMapper;
    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public PageResult findCash(Integer page, Integer rows, Cash cash, Business business) {
        if(page==null){
            rows=10;
                    page=1;
        }
        PageHelper.startPage(page,rows);
        BusinessExample businessExample=new BusinessExample();
        BusinessExample.Criteria criteria = businessExample.createCriteria();
        CashExample cashExample=new CashExample();
        CashExample.Criteria criteria1 = cashExample.createCriteria();
        if(business!=null){
            if(business.getName()!=null && business.getName()!=""){
                criteria.andNameLike("%"+business.getName()+"%");
            }
        }
        List<Business> businesses = businessMapper.selectByExample(businessExample);
        List<CashBusiness> result=new ArrayList<>();
        List<Cash> cashs = cashMapper.selectByExample(cashExample);
        for (Cash cash1 : cashs) {
            Business business1=businessMapper.selectByPrimaryKey(cash1.getBusinessId());
            CashBusiness cashBusiness=new CashBusiness(cash1,business1);
            if (business.getName() == null || business.getName().equals("")) {
                result.add(cashBusiness);

            }else{
                if(cashBusiness.getBusiness().getName().equals(business.getName())){
                    result.add(cashBusiness);
                }
            }



        }





        int count=cashMapper.countByExample(cashExample);

        long totalPage  = (long) Math.ceil((double) count/ rows) ;

        return new PageResult(count,result,page,rows,totalPage);
    }

    @Override
    public Result deleteCash(Cash cash) {
        try {
            cashMapper.deleteByPrimaryKey(cash.getId());
            return  new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(true,"删除失败");
        }

    }
}

