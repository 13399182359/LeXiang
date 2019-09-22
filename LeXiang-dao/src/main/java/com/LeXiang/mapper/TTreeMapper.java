package com.LeXiang.mapper;

import com.LeXiang.pojo.TTree;
import com.LeXiang.pojo.TTreeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TTreeMapper {
    int countByExample(TTreeExample example);

    int deleteByExample(TTreeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTree record);

    int insertSelective(TTree record);

    List<TTree> selectByExample(TTreeExample example);

    TTree selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTree record, @Param("example") TTreeExample example);

    int updateByExample(@Param("record") TTree record, @Param("example") TTreeExample example);

    int updateByPrimaryKeySelective(TTree record);

    int updateByPrimaryKey(TTree record);
}