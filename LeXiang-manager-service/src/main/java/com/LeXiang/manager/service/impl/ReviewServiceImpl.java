package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.ReviewService;
import com.LeXiang.mapper.MemberMapper;
import com.LeXiang.mapper.ProductMapper;
import com.LeXiang.mapper.ReviewMapper;
import com.LeXiang.mapper.StoreMapper;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Service
public class ReviewServiceImpl  implements ReviewService {

    @Autowired
    private ReviewMapper reviewMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private MemberMapper memberMapper;



    @Override
    public PageResult queryReview(Integer page, Integer rows, Review review) {
        if(page==null){
            rows=5;
            page=1;
        }

        PageHelper.startPage(page,rows);
        List<PointMember> result=new ArrayList<>();
        ReviewExample reviewExample=new ReviewExample();
        ReviewExample.Criteria criteria = reviewExample.createCriteria();
        if(review!=null){
        if(review.getContent()!=null && !review.getContent().equals("")){
            criteria.andContentLike("%"+review.getContent()+"%");
        }
        }
        List<Review> reviews = reviewMapper.selectByExample(reviewExample);
        for (Review review1 : reviews) {
            Product product=productMapper.selectByPrimaryKey(review1.getProductId());
            Member member= memberMapper.selectByPrimaryKey(review1.getMemberId());
            PointMember pointMember = new PointMember(member, product, review1);

            result.add(pointMember);
        }

        long count=reviewMapper.countByExample(reviewExample);


        long totalPage  = (long) Math.ceil((double) count/ rows) ;
        PageResult pageResult = new PageResult(count, result, page, rows, totalPage);
        System.out.println(pageResult);
        return pageResult;
    }

    @Override
    public Result deleteReview(Review review) {
        try {
            reviewMapper.deleteByPrimaryKey(review.getId());
            return  new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(true,"删除失败");
        }
    }

    @Override
    public List<Review> findAll() {
        return reviewMapper.selectByExample(null);
    }

    @Override
    public Map<String, Object> queryEcharts() {
        Map<String,Object> map=new HashMap<>();
        List<Review> pointlogs = reviewMapper.selectByExample(null);
        List<Date> createddate=new ArrayList<>();
        List<Integer> score=new ArrayList<>();
        for (Review pointlog : pointlogs) {
            createddate.add(pointlog.getCreateddate());
            score.add(pointlog.getScore());
        }
        map.put("createddate",createddate);
        map.put("score",score);

        return map;
    }

    @Override
    public void insert(List<Review> pointlogs) {
        for (Review pointlog : pointlogs) {
            reviewMapper.insert(pointlog);
        }
    }
}
