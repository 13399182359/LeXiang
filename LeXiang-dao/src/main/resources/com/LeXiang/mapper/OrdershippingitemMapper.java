package com.LeXiang.mapper;

import com.LeXiang.pojo.Ordershippingitem;
import com.LeXiang.pojo.OrdershippingitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdershippingitemMapper {
    int countByExample(OrdershippingitemExample example);

    int deleteByExample(OrdershippingitemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Ordershippingitem record);

    int insertSelective(Ordershippingitem record);

    List<Ordershippingitem> selectByExampleWithBLOBs(OrdershippingitemExample example);

    List<Ordershippingitem> selectByExample(OrdershippingitemExample example);

    Ordershippingitem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ordershippingitem record, @Param("example") OrdershippingitemExample example);

    int updateByExampleWithBLOBs(@Param("record") Ordershippingitem record, @Param("example") OrdershippingitemExample example);

    int updateByExample(@Param("record") Ordershippingitem record, @Param("example") OrdershippingitemExample example);

    int updateByPrimaryKeySelective(Ordershippingitem record);

    int updateByPrimaryKeyWithBLOBs(Ordershippingitem record);

    int updateByPrimaryKey(Ordershippingitem record);
}