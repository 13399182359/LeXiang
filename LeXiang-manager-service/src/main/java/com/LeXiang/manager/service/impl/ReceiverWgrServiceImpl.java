package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.ReceiverResult;
import com.LeXiang.manager.service.ReceiverWgrService;
import com.LeXiang.mapper.AreaMapper;
import com.LeXiang.mapper.MemberMapper;
import com.LeXiang.mapper.ReceiverMapper;
import com.LeXiang.pojo.Area;
import com.LeXiang.pojo.AreaExample;
import com.LeXiang.pojo.Receiver;
import com.LeXiang.pojo.ReceiverExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @类名: ReceiverWgrImpl
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-20 14:35
 **/
@Service(timeout = 6000)
public class ReceiverWgrServiceImpl implements ReceiverWgrService {

    @Autowired
    private ReceiverMapper receiverMapper;
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private AreaMapper areaMapper;

    @Override
    public PageResult findReceiver(Integer pageNum, Integer pageSize, Receiver receiver) {
        PageHelper.startPage(pageNum,pageSize);

        ReceiverExample receiverExample = new ReceiverExample();
        ReceiverExample.Criteria criteria = receiverExample.createCriteria();
        if(receiver!=null){
            if(receiver.getMemberId()!=null){
                criteria.andMemberIdEqualTo(receiver.getMemberId());
            }
        }
        List<Receiver> receivers = receiverMapper.selectByExample(receiverExample);
        ArrayList<ReceiverResult> receiverResults = new ArrayList<>();
        for (Receiver receiver1 : receivers) {
            Area area = areaMapper.selectByPrimaryKey(receiver1.getAreaId());
            ReceiverResult receiverResult = new ReceiverResult(receiver1, area, null);
            receiverResults.add(receiverResult);
        }
        long totalPage = (long) (Math.ceil(receiverResults.size() / pageSize) + 1);
        return new PageResult(receiverResults.size(), receiverResults, pageNum, pageSize, totalPage);

    }

    @Override
    public void saveReceiver(Receiver receiver) {
        receiverMapper.insert(receiver);
    }

    @Override
    public void updReceiver(Receiver receiver) {
        receiverMapper.updateByPrimaryKey(receiver);
    }

    @Override
    public Receiver findReceiverById(Long id) {
        return receiverMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delReceiver(Long id) {
            receiverMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List findArea(Long parentId) {
        AreaExample areaExample = new AreaExample();
        AreaExample.Criteria criteria = areaExample.createCriteria();
        if(parentId!=null){
            criteria.andParentIdEqualTo(parentId);
        }else{
            return areaMapper.selectByExample(null);
        }
        return areaMapper.selectByExample(areaExample);
    }

    @Override
    public List findAreaSheng(String treepath) {
        AreaExample areaExample = new AreaExample();
        AreaExample.Criteria criteria = areaExample.createCriteria();
            criteria.andTreepathEqualTo(treepath);
        return areaMapper.selectByExample(areaExample);
    }
}
