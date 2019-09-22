package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.pojo.Friendlink;

public interface FriendLinkService {


    PageResult findFriendLink(Integer pageNum, Integer pageSize, Friendlink friendlink);

    void saveFriendLink(Friendlink friendlink);

    void updFriendLink(Friendlink friendlink);

    void delFriendLink(Long[] ids);

    Friendlink findFriendLinkById(long id);
}
