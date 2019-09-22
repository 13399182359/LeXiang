package com.LeXiang.manager.service.impl;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.manager.service.FriendLinkService;
import com.LeXiang.mapper.FriendlinkMapper;
import com.LeXiang.pojo.Friendlink;
import com.LeXiang.pojo.FriendlinkExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @类名: FriendLinkServiceImpl
 * @描述:
 * @作者: 王葛瑞
 * @时间: 2019-09-16 19:39
 **/
@Service(timeout = 6000)
public class FriendLinkServiceImpl implements FriendLinkService {
    @Autowired
    private FriendlinkMapper friendlinkMapper;

    @Override
    public PageResult findFriendLink(Integer pageNum, Integer pageSize, Friendlink friendlink) {
        PageHelper.startPage(pageNum,pageSize);
        //设置查询条件
        FriendlinkExample friendlinkExample = new FriendlinkExample();
        FriendlinkExample.Criteria criteria = friendlinkExample.createCriteria();
        if(friendlink!=null){
            if(friendlink.getName()!=null && friendlink.getName().length()>0){
                criteria.andNameLike("%"+friendlink.getName()+"%");
            }
        }
        List<Friendlink> friendlinks = friendlinkMapper.selectByExample(friendlinkExample);
        long totalPage = (long) (Math.ceil(friendlinks.size() / pageSize) + 1);

        return new PageResult(friendlinks.size(),friendlinks,pageNum,pageSize,totalPage);
    }

    @Override
    public void saveFriendLink(Friendlink friendlink) {
        friendlink.setCreateddate(new Date());
        friendlink.setLastmodifieddate(new Date());
        friendlinkMapper.insert(friendlink);
    }

    @Override
    public void updFriendLink(Friendlink friendlink) {
        friendlinkMapper.updateByPrimaryKey(friendlink);
    }

    @Override
    public void delFriendLink(Long[] ids) {
        for (Long id : ids) {
            friendlinkMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public Friendlink findFriendLinkById(long id) {
        return friendlinkMapper.selectByPrimaryKey(id);
    }
}
