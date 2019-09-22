package com.LeXiang.manager.service;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.pojo.Consultation;
import com.LeXiang.pojo.Review;

public interface ConsultationService {
    PageResult queryConsulatiton(Integer page, Integer rows, Consultation consultation);

    Result deleteConsulatiton(Consultation consultation);
}
