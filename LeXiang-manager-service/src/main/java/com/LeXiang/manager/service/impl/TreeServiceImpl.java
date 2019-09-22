package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.TreeService;
import com.LeXiang.mapper.TTreeMapper;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.TTree;
import com.LeXiang.pojo.TTreeExample;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/17 8:38
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class TreeServiceImpl implements TreeService {
    @Autowired
    private TTreeMapper tTreeMapper;
    @Override
    public ResultBean findAll(Integer id) {
        if (id == null){
            id = 0;
        }
        TTreeExample tTreeExample = new TTreeExample();
        TTreeExample.Criteria criteria = tTreeExample.createCriteria();
        criteria.andPidEqualTo(id);
        TTree tTree = tTreeMapper.selectByPrimaryKey(id);
        List<TTree> tTrees = tTreeMapper.selectByExample(tTreeExample);
        ResultBean bean = new ResultBean();
        bean.setTTree(tTree);
        bean.setRows(tTrees);
        return bean;
    }


    @Override
    public List findWhere() {
        TTreeExample tTreeExample = new TTreeExample();
        TTreeExample.Criteria criteria = tTreeExample.createCriteria();
        criteria.andPidEqualTo(0);
        return tTreeMapper.selectByExample(tTreeExample);
    }
}
