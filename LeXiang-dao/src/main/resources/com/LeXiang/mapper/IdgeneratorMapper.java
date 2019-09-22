package com.LeXiang.mapper;

import com.LeXiang.pojo.Idgenerator;
import com.LeXiang.pojo.IdgeneratorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdgeneratorMapper {
    int countByExample(IdgeneratorExample example);

    int deleteByExample(IdgeneratorExample example);

    int deleteByPrimaryKey(String sequenceName);

    int insert(Idgenerator record);

    int insertSelective(Idgenerator record);

    List<Idgenerator> selectByExample(IdgeneratorExample example);

    Idgenerator selectByPrimaryKey(String sequenceName);

    int updateByExampleSelective(@Param("record") Idgenerator record, @Param("example") IdgeneratorExample example);

    int updateByExample(@Param("record") Idgenerator record, @Param("example") IdgeneratorExample example);

    int updateByPrimaryKeySelective(Idgenerator record);

    int updateByPrimaryKey(Idgenerator record);
}