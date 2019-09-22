package com.LeXiang.mapper;

import com.LeXiang.pojo.Orderreturnsitem;
import com.LeXiang.pojo.OrderreturnsitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderreturnsitemMapper {
    int countByExample(OrderreturnsitemExample example);

    int deleteByExample(OrderreturnsitemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Orderreturnsitem record);

    int insertSelective(Orderreturnsitem record);

    List<Orderreturnsitem> selectByExampleWithBLOBs(OrderreturnsitemExample example);

    List<Orderreturnsitem> selectByExample(OrderreturnsitemExample example);

    Orderreturnsitem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Orderreturnsitem record, @Param("example") OrderreturnsitemExample example);

    int updateByExampleWithBLOBs(@Param("record") Orderreturnsitem record, @Param("example") OrderreturnsitemExample example);

    int updateByExample(@Param("record") Orderreturnsitem record, @Param("example") OrderreturnsitemExample example);

    int updateByPrimaryKeySelective(Orderreturnsitem record);

    int updateByPrimaryKeyWithBLOBs(Orderreturnsitem record);

    int updateByPrimaryKey(Orderreturnsitem record);
}