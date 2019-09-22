package com.LeXiang.mapper;

import com.LeXiang.pojo.Consultation;
import com.LeXiang.pojo.ConsultationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsultationMapper {
    int countByExample(ConsultationExample example);

    int deleteByExample(ConsultationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Consultation record);

    int insertSelective(Consultation record);

    List<Consultation> selectByExample(ConsultationExample example);

    Consultation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Consultation record, @Param("example") ConsultationExample example);

    int updateByExample(@Param("record") Consultation record, @Param("example") ConsultationExample example);

    int updateByPrimaryKeySelective(Consultation record);

    int updateByPrimaryKey(Consultation record);
}