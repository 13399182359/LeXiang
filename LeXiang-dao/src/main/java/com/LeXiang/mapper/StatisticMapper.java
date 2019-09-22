package com.LeXiang.mapper;

import com.LeXiang.pojo.Statistic;
import com.LeXiang.pojo.StatisticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatisticMapper {
    int countByExample(StatisticExample example);

    int deleteByExample(StatisticExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Statistic record);

    int insertSelective(Statistic record);

    List<Statistic> selectByExample(StatisticExample example);

    Statistic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Statistic record, @Param("example") StatisticExample example);

    int updateByExample(@Param("record") Statistic record, @Param("example") StatisticExample example);

    int updateByPrimaryKeySelective(Statistic record);

    int updateByPrimaryKey(Statistic record);
}