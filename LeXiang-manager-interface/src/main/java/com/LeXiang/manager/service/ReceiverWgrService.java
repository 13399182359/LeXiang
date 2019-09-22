package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.pojo.Receiver;

import java.util.List;

public interface ReceiverWgrService {
    PageResult findReceiver(Integer pageNum, Integer pageSize, Receiver receiver);

    void saveReceiver(Receiver receiver);

    void updReceiver(Receiver receiver);

    Receiver findReceiverById(Long id);

    void delReceiver(Long id);

    List findArea(Long parentId);

    List findAreaSheng(String treepath);
}
