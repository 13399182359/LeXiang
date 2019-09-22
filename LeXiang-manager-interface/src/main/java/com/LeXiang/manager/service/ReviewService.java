package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.pojo.Review;

import java.util.List;
import java.util.Map;

public interface ReviewService {
    PageResult queryReview(Integer page, Integer rows, Review review);

    Result deleteReview(Review review);

    List<Review> findAll();

    Map<String, Object> queryEcharts();

    void insert(List<Review> pointlogs);
}
