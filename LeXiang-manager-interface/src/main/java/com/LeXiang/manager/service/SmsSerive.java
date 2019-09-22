package com.LeXiang.manager.service;

import com.LeXiang.Entity.Result;
import com.LeXiang.pojo.Displaysetup;

import java.util.List;

/**
 * @类名: SmsSerive
 * @描述:
 * @作者: 姚文华
 * @时间: 2019-09-09 22:44
 **/
public interface SmsSerive {
    Displaysetup findSms();

    Result smsUpdate(Displaysetup displaysetup);
}

