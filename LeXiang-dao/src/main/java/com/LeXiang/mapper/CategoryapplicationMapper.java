package com.LeXiang.mapper;

import com.LeXiang.pojo.Categoryapplication;
import com.LeXiang.pojo.CategoryapplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryapplicationMapper {
    int countByExample(CategoryapplicationExample example);

    int deleteByExample(CategoryapplicationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Categoryapplication record);

    int insertSelective(Categoryapplication record);

    List<Categoryapplication> selectByExample(CategoryapplicationExample example);

    Categoryapplication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Categoryapplication record, @Param("example") CategoryapplicationExample example);

    int updateByExample(@Param("record") Categoryapplication record, @Param("example") CategoryapplicationExample example);

    int updateByPrimaryKeySelective(Categoryapplication record);

    int updateByPrimaryKey(Categoryapplication record);
}