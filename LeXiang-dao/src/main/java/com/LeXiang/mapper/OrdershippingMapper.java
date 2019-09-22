package com.LeXiang.mapper;

import com.LeXiang.pojo.Ordershipping;
import com.LeXiang.pojo.OrdershippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdershippingMapper {
    int countByExample(OrdershippingExample example);

    int deleteByExample(OrdershippingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Ordershipping record);

    int insertSelective(Ordershipping record);

    List<Ordershipping> selectByExample(OrdershippingExample example);

    Ordershipping selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ordershipping record, @Param("example") OrdershippingExample example);

    int updateByExample(@Param("record") Ordershipping record, @Param("example") OrdershippingExample example);

    int updateByPrimaryKeySelective(Ordershipping record);

    int updateByPrimaryKey(Ordershipping record);
}