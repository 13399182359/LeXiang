package com.LeXiang.mapper;

import com.LeXiang.pojo.Orderreturns;
import com.LeXiang.pojo.OrderreturnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderreturnsMapper {
    int countByExample(OrderreturnsExample example);

    int deleteByExample(OrderreturnsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Orderreturns record);

    int insertSelective(Orderreturns record);

    List<Orderreturns> selectByExample(OrderreturnsExample example);

    Orderreturns selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Orderreturns record, @Param("example") OrderreturnsExample example);

    int updateByExample(@Param("record") Orderreturns record, @Param("example") OrderreturnsExample example);

    int updateByPrimaryKeySelective(Orderreturns record);

    int updateByPrimaryKey(Orderreturns record);
}