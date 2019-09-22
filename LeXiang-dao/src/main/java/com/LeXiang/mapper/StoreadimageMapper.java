package com.LeXiang.mapper;

import com.LeXiang.pojo.Storeadimage;
import com.LeXiang.pojo.StoreadimageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreadimageMapper {
    int countByExample(StoreadimageExample example);

    int deleteByExample(StoreadimageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Storeadimage record);

    int insertSelective(Storeadimage record);

    List<Storeadimage> selectByExample(StoreadimageExample example);

    Storeadimage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Storeadimage record, @Param("example") StoreadimageExample example);

    int updateByExample(@Param("record") Storeadimage record, @Param("example") StoreadimageExample example);

    int updateByPrimaryKeySelective(Storeadimage record);

    int updateByPrimaryKey(Storeadimage record);
}