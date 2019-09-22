package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.MessagerConfigService;
import com.LeXiang.mapper.MessageMapper;
import com.LeXiang.mapper.MessageconfigMapper;
import com.LeXiang.pojo.Messageconfig;
import com.LeXiang.pojo.MessageconfigExample;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class MessagerConfigServiceImpl implements MessagerConfigService {
    @Autowired
    private MessageconfigMapper messageconfigMapper;


    @Override
    public Result updateMessagerConfig(Messageconfig messageconfig) {
        MessageconfigExample messageconfigExample=new MessageconfigExample();
        MessageconfigExample.Criteria criteria = messageconfigExample.createCriteria();
        criteria.andIdEqualTo(messageconfig.getId());

        try {
            messageconfigMapper.updateByExample(messageconfig,messageconfigExample);
            return  new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(true,"修改失败");
        }
    }

    @Override
    public Messageconfig queryMessagerConfig(Messageconfig messageconfig) {
        return messageconfigMapper.selectByPrimaryKey(messageconfig.getId());
    }
}
