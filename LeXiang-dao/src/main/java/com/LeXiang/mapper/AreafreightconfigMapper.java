package com.LeXiang.mapper;

import com.LeXiang.pojo.Areafreightconfig;
import com.LeXiang.pojo.AreafreightconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreafreightconfigMapper {
    int countByExample(AreafreightconfigExample example);

    int deleteByExample(AreafreightconfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Areafreightconfig record);

    int insertSelective(Areafreightconfig record);

    List<Areafreightconfig> selectByExample(AreafreightconfigExample example);

    Areafreightconfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Areafreightconfig record, @Param("example") AreafreightconfigExample example);

    int updateByExample(@Param("record") Areafreightconfig record, @Param("example") AreafreightconfigExample example);

    int updateByPrimaryKeySelective(Areafreightconfig record);

    int updateByPrimaryKey(Areafreightconfig record);
}