package com.LeXiang.mapper;

import com.LeXiang.pojo.Adposition;
import com.LeXiang.pojo.AdpositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdpositionMapper {
    int countByExample(AdpositionExample example);

    int deleteByExample(AdpositionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Adposition record);

    int insertSelective(Adposition record);

    List<Adposition> selectByExampleWithBLOBs(AdpositionExample example);

    List<Adposition> selectByExample(AdpositionExample example);

    Adposition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Adposition record, @Param("example") AdpositionExample example);

    int updateByExampleWithBLOBs(@Param("record") Adposition record, @Param("example") AdpositionExample example);

    int updateByExample(@Param("record") Adposition record, @Param("example") AdpositionExample example);

    int updateByPrimaryKeySelective(Adposition record);

    int updateByPrimaryKeyWithBLOBs(Adposition record);

    int updateByPrimaryKey(Adposition record);
}