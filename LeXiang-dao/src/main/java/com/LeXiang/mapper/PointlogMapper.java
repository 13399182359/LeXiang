package com.LeXiang.mapper;

import com.LeXiang.pojo.Pointlog;
import com.LeXiang.pojo.PointlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointlogMapper {
    int countByExample(PointlogExample example);

    int deleteByExample(PointlogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Pointlog record);

    int insertSelective(Pointlog record);

    List<Pointlog> selectByExample(PointlogExample example);

    Pointlog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Pointlog record, @Param("example") PointlogExample example);

    int updateByExample(@Param("record") Pointlog record, @Param("example") PointlogExample example);

    int updateByPrimaryKeySelective(Pointlog record);

    int updateByPrimaryKey(Pointlog record);
}