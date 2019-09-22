package com.LeXiang.manager.service;

import com.LeXiang.Entity.Result;
import com.LeXiang.pojo.Messageconfig;

public interface MessagerConfigService {
    Result updateMessagerConfig(Messageconfig messageconfig);

    Messageconfig queryMessagerConfig(Messageconfig messageconfig);
}
