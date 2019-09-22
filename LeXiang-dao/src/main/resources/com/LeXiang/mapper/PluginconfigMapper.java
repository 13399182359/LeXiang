package com.LeXiang.mapper;

import com.LeXiang.pojo.Pluginconfig;
import com.LeXiang.pojo.PluginconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginconfigMapper {
    int countByExample(PluginconfigExample example);

    int deleteByExample(PluginconfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Pluginconfig record);

    int insertSelective(Pluginconfig record);

    List<Pluginconfig> selectByExampleWithBLOBs(PluginconfigExample example);

    List<Pluginconfig> selectByExample(PluginconfigExample example);

    Pluginconfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Pluginconfig record, @Param("example") PluginconfigExample example);

    int updateByExampleWithBLOBs(@Param("record") Pluginconfig record, @Param("example") PluginconfigExample example);

    int updateByExample(@Param("record") Pluginconfig record, @Param("example") PluginconfigExample example);

    int updateByPrimaryKeySelective(Pluginconfig record);

    int updateByPrimaryKeyWithBLOBs(Pluginconfig record);

    int updateByPrimaryKey(Pluginconfig record);
}