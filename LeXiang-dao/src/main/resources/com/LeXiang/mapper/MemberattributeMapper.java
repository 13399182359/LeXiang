package com.LeXiang.mapper;

import com.LeXiang.pojo.Memberattribute;
import com.LeXiang.pojo.MemberattributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberattributeMapper {
    int countByExample(MemberattributeExample example);

    int deleteByExample(MemberattributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Memberattribute record);

    int insertSelective(Memberattribute record);

    List<Memberattribute> selectByExampleWithBLOBs(MemberattributeExample example);

    List<Memberattribute> selectByExample(MemberattributeExample example);

    Memberattribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Memberattribute record, @Param("example") MemberattributeExample example);

    int updateByExampleWithBLOBs(@Param("record") Memberattribute record, @Param("example") MemberattributeExample example);

    int updateByExample(@Param("record") Memberattribute record, @Param("example") MemberattributeExample example);

    int updateByPrimaryKeySelective(Memberattribute record);

    int updateByPrimaryKeyWithBLOBs(Memberattribute record);

    int updateByPrimaryKey(Memberattribute record);
}