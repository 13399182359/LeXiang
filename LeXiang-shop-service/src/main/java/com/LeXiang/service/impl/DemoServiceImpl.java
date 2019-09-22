package com.LeXiang.service.impl;

import com.LeXiang.service.DemoService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @类名: DemoServiceImpl
 * @描述:
 * @作者: 姚文华
 * @时间: 2019-09-09 14:47
 **/
@Service(timeout = 60000)
public class DemoServiceImpl  {
    private  int a=0;

}

