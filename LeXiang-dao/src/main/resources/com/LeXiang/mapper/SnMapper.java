package com.LeXiang.mapper;

import com.LeXiang.pojo.Sn;
import com.LeXiang.pojo.SnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SnMapper {
    int countByExample(SnExample example);

    int deleteByExample(SnExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sn record);

    int insertSelective(Sn record);

    List<Sn> selectByExample(SnExample example);

    Sn selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sn record, @Param("example") SnExample example);

    int updateByExample(@Param("record") Sn record, @Param("example") SnExample example);

    int updateByPrimaryKeySelective(Sn record);

    int updateByPrimaryKey(Sn record);
}