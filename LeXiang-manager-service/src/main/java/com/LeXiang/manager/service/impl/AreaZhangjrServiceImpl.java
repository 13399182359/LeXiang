package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.AreaZhangjrService;
import com.LeXiang.mapper.AreaMapper;
import com.LeXiang.mapper.ReceiverMapper;
import com.LeXiang.pojo.AreaExample;
import com.LeXiang.pojo.Receiver;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/21 15:13
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class AreaZhangjrServiceImpl implements AreaZhangjrService {
    @Autowired
    private AreaMapper areaMapper;
    @Autowired
    private ReceiverMapper receiverMapper;

    @Override
    public List findWhere(Long id) {
        AreaExample areaExample = new AreaExample();
        AreaExample.Criteria criteria = areaExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        return areaMapper.selectByExample(areaExample);
    }

    @Override
    public Receiver addArea(Receiver receiver) {
        receiverMapper.insert(receiver);
        List<Receiver> receivers = receiverMapper.selectByExample(null);
        Long id = 0l;
        for (int i = 0; i < receivers.size(); i++) {
            for (int j = 0; j < receivers.size(); j++) {
                if (receivers.get(i).getId()<receivers.get(j).getId()) {
                    id = receivers.get(j).getId();
                }
            }
        }
        receiver.setId(id);
        return receiver;
    }
}
