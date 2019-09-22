package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.ConsultationService;
import com.LeXiang.mapper.ConsultationMapper;
import com.LeXiang.mapper.MemberMapper;
import com.LeXiang.mapper.ProductMapper;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsultationServiceImpl  implements ConsultationService {
    @Autowired
    private ConsultationMapper consultationMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public PageResult queryConsulatiton(Integer page, Integer rows, Consultation consultation) {
        if(page==null){
            rows=10;
            page=1;
        }
        PageHelper.startPage(page,rows);
        List<PointMember> result=new ArrayList<>();
       ConsultationExample consultationExample=new ConsultationExample();
        ConsultationExample.Criteria criteria = consultationExample.createCriteria();
        if(consultation!=null){
            if(consultation.getContent()!=null && !consultation.getContent().equals("")){
                criteria.andContentLike("%"+consultation.getContent()+"%");
            }
        }
        List<Consultation> consultations = consultationMapper.selectByExample(consultationExample);
        for (Consultation consultation1: consultations) {
            Product product=productMapper.selectByPrimaryKey(consultation1.getProductId());
            Member member= memberMapper.selectByPrimaryKey(consultation1.getMemberId());
            PointMember pointMember = new PointMember(member, product, consultation1);

            result.add(pointMember);
        }

        long count=consultationMapper.countByExample(consultationExample);


        long totalPage  = (long) Math.ceil((double) count/ rows) ;
        PageResult pageResult = new PageResult(count, result, page, rows, totalPage);
        System.out.println(pageResult);
        return pageResult;
    }

    @Override
    public Result deleteConsulatiton(Consultation consultation) {
        try {
            consultationMapper.deleteByPrimaryKey(consultation.getId());
            return  new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(true,"删除失败");
        }
    }
}
