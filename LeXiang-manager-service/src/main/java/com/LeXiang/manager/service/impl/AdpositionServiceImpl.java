package com.LeXiang.manager.service.impl;


import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.AdpositionService;
import com.LeXiang.mapper.AdpositionMapper;
import com.LeXiang.pojo.Adposition;
import com.LeXiang.pojo.AdpositionExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AdpositionServiceImpl implements AdpositionService {
    @Autowired
    private AdpositionMapper adpositionMapper;

    @Override
    public PageResult queryAdposition(Integer page, Integer rows, Adposition adposition) {

        if(page==null | rows==null){
            rows=10;
            page=1;
        }
        PageHelper.startPage(page,rows);
        AdpositionExample adpositionExample=new AdpositionExample();
        AdpositionExample.Criteria criteria = adpositionExample.createCriteria();
        if(adposition!=null){
        if(adposition.getName()!=null && !adposition.getName().equals("")){
            criteria.andNameLike("%"+adposition.getName()+"%");
        }
        if(adposition.getId()!=null ){
            criteria.andIdEqualTo(adposition.getId());
        }
        }

        List<Adposition> adpositions = adpositionMapper.selectByExample(adpositionExample);
        long totalPage  = (long) Math.ceil((double) adpositions.size()/ rows) ;

        return new PageResult(adpositions.size(),adpositions,page,rows,totalPage);
    }

    @Override
    public Result deleteAdposition(long[] ids) {
        try {
            for (long id : ids) {
                adpositionMapper.deleteByPrimaryKey(id);
            }
            return  new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"删除失败");
        }
    }

    @Override
    public Result updateAdposition(Adposition adposition) {
        try {
            AdpositionExample adpositionExample =new AdpositionExample();
            AdpositionExample.Criteria criteria = adpositionExample.createCriteria();
            criteria.andIdEqualTo(adposition.getId());
            adpositionMapper.updateByExample(adposition,adpositionExample);
            return  new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"修改失败");
        }
    }

    @Override
    public Adposition queryAdpositionById(long id) {
        return adpositionMapper.selectByPrimaryKey(id);
    }

    @Override
    public Result addAdposition(Adposition adposition) {
        try {
            adpositionMapper.insert(adposition);
            return  new Result(true,"新增成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"新增失败");
        }
    }
}
