package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.SeoService;
import com.LeXiang.mapper.SeoMapper;
import com.LeXiang.mapper.TTreeMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Seo;
import com.LeXiang.pojo.TTree;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/16 20:05
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class SeoServiceImpl implements SeoService {

    @Autowired
    private SeoMapper seoMapper;
    @Autowired
    private TTreeMapper tTreeMapper;
    @Override
    public ResultBean findAll(ResultBean resultBean) {
        PageHelper.startPage(resultBean.getPage(),resultBean.getMeiPageCount());
        List<Seo> list1 = seoMapper.selectByExample(null);
        List list = new ArrayList();
        for (Seo seo : list1) {
            TTree tTree = tTreeMapper.selectByPrimaryKey(seo.getType());
            if (tTree!=null) {
                ResultBean bean = new ResultBean();

                bean.setTTree(tTree);
                bean.setSeo(seo);
                list.add(bean);
            }
        }
        double s1 = (double) list.size()/resultBean.getMeiPageCount();
        return new ResultBean(list.size(),list,resultBean.getPage(),(int)Math.ceil(s1),resultBean.getMeiPageCount());
    }

    @Override
    public ResultBean findOne(Long id) {
        Seo seo = seoMapper.selectByPrimaryKey(id);
        TTree tTree = tTreeMapper.selectByPrimaryKey(seo.getType());
        ResultBean bean = new ResultBean();
        bean.setSeo(seo);
        bean.setTTree(tTree);
        return bean;
    }

    @Override
    public void addOrUpdate(Seo seo) {
        if (seo.getId()!=null) {
            seoMapper.updateByPrimaryKey(seo);
        }else {
            seoMapper.insert(seo);
        }
    }
}
