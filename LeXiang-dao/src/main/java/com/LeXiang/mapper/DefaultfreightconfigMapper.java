package com.LeXiang.mapper;

import com.LeXiang.pojo.Defaultfreightconfig;
import com.LeXiang.pojo.DefaultfreightconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DefaultfreightconfigMapper {
    int countByExample(DefaultfreightconfigExample example);

    int deleteByExample(DefaultfreightconfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Defaultfreightconfig record);

    int insertSelective(Defaultfreightconfig record);

    List<Defaultfreightconfig> selectByExample(DefaultfreightconfigExample example);

    Defaultfreightconfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Defaultfreightconfig record, @Param("example") DefaultfreightconfigExample example);

    int updateByExample(@Param("record") Defaultfreightconfig record, @Param("example") DefaultfreightconfigExample example);

    int updateByPrimaryKeySelective(Defaultfreightconfig record);

    int updateByPrimaryKey(Defaultfreightconfig record);
}