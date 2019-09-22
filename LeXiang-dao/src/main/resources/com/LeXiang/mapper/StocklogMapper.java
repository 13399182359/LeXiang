package com.LeXiang.mapper;

import com.LeXiang.pojo.Stocklog;
import com.LeXiang.pojo.StocklogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StocklogMapper {
    int countByExample(StocklogExample example);

    int deleteByExample(StocklogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Stocklog record);

    int insertSelective(Stocklog record);

    List<Stocklog> selectByExample(StocklogExample example);

    Stocklog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Stocklog record, @Param("example") StocklogExample example);

    int updateByExample(@Param("record") Stocklog record, @Param("example") StocklogExample example);

    int updateByPrimaryKeySelective(Stocklog record);

    int updateByPrimaryKey(Stocklog record);
}