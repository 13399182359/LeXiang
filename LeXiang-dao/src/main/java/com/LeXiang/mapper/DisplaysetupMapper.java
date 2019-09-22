package com.LeXiang.mapper;

import com.LeXiang.pojo.Displaysetup;
import com.LeXiang.pojo.DisplaysetupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisplaysetupMapper {
    int countByExample(DisplaysetupExample example);

    int deleteByExample(DisplaysetupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Displaysetup record);

    int insertSelective(Displaysetup record);

    List<Displaysetup> selectByExample(DisplaysetupExample example);

    Displaysetup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Displaysetup record, @Param("example") DisplaysetupExample example);

    int updateByExample(@Param("record") Displaysetup record, @Param("example") DisplaysetupExample example);

    int updateByPrimaryKeySelective(Displaysetup record);

    int updateByPrimaryKey(Displaysetup record);
}