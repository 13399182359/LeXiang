package com.LeXiang.mapper;

import com.LeXiang.pojo.Attribute;
import com.LeXiang.pojo.AttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttributeMapper {
    int countByExample(AttributeExample example);

    int deleteByExample(AttributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    List<Attribute> selectByExampleWithBLOBs(AttributeExample example);

    List<Attribute> selectByExample(AttributeExample example);

    Attribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByExample(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKeyWithBLOBs(Attribute record);

    int updateByPrimaryKey(Attribute record);
}