package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.AdService;
import com.LeXiang.mapper.AdMapper;
import com.LeXiang.mapper.AdpositionMapper;
import com.LeXiang.pojo.Ad;
import com.LeXiang.pojo.AdExample;
import com.LeXiang.pojo.Adposition;
import com.LeXiang.pojo.PointMember;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdServiceImpl implements AdService {
    @Autowired
    private AdMapper adMapper;
    @Autowired
    private AdpositionMapper adpositionMapper;


    @Override
    public PageResult queryAd(Integer page, Integer rows, Ad ad, Adposition adposition) {
        List<PointMember> pointMembers=new ArrayList<>();
        if(page==null | rows==null){
            rows=10;
            page=1;
        }
        PageHelper.startPage(page,rows);
        AdExample adExample=new AdExample();
        AdExample.Criteria criteria = adExample.createCriteria();
        if(ad!=null){
            if(ad.getTitle()!=null && !ad.getTitle().equals("")){
                criteria.andTitleLike("%"+ad.getTitle()+"%");
            }

        }


        List<Ad> adpositions = adMapper.selectByExample(adExample);
        for (Ad adposition1 : adpositions) {
            Adposition adpositionList=adpositionMapper.selectByPrimaryKey(adposition1.getAdpositionId());
            PointMember pointMember = new PointMember(adposition1, adpositionList);
            pointMembers.add(pointMember);
        }
        long totalPage  = (long) Math.ceil((double) adpositions.size()/ rows) ;

        return new PageResult(pointMembers.size(),pointMembers,page,rows,totalPage);
    }

    @Override
    public Result deleteAd(long[] ids) {
        try {
            for (long id : ids) {
                adMapper.deleteByPrimaryKey(id);
            }
            return  new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"删除失败");
        }
    }

    @Override
    public Result updateAd(Ad ad) {
        try {
            AdExample adpositionExample =new AdExample();
            AdExample.Criteria criteria = adpositionExample.createCriteria();
            criteria.andIdEqualTo(ad.getId());
            adMapper.updateByExample(ad,adpositionExample);
            return  new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"修改失败");
        }
    }

    @Override
    public Ad queryAdById(long id) {
        return adMapper.selectByPrimaryKey(id);
    }

    @Override
    public Result addAd(Ad ad) {
        try {
            adMapper.insert(ad);
            return  new Result(true,"新增成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"新增失败");
        }
    }

    @Override
    public List<Adposition> queryadpostion() {
        return adpositionMapper.selectByExample(null);
    }
}
