package com.LeXiang.mapper;

import com.LeXiang.pojo.Messageconfig;
import com.LeXiang.pojo.MessageconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageconfigMapper {
    int countByExample(MessageconfigExample example);

    int deleteByExample(MessageconfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Messageconfig record);

    int insertSelective(Messageconfig record);

    List<Messageconfig> selectByExample(MessageconfigExample example);

    Messageconfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Messageconfig record, @Param("example") MessageconfigExample example);

    int updateByExample(@Param("record") Messageconfig record, @Param("example") MessageconfigExample example);

    int updateByPrimaryKeySelective(Messageconfig record);

    int updateByPrimaryKey(Messageconfig record);
}