package com.LeXiang.mapper;

import com.LeXiang.pojo.Navigation;
import com.LeXiang.pojo.NavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NavigationMapper {
    int countByExample(NavigationExample example);

    int deleteByExample(NavigationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Navigation record);

    int insertSelective(Navigation record);

    List<Navigation> selectByExample(NavigationExample example);

    Navigation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Navigation record, @Param("example") NavigationExample example);

    int updateByExample(@Param("record") Navigation record, @Param("example") NavigationExample example);

    int updateByPrimaryKeySelective(Navigation record);

    int updateByPrimaryKey(Navigation record);
}