package com.LeXiang.mapper;

import com.LeXiang.pojo.Shippingmethod;
import com.LeXiang.pojo.ShippingmethodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingmethodMapper {
    int countByExample(ShippingmethodExample example);

    int deleteByExample(ShippingmethodExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Shippingmethod record);

    int insertSelective(Shippingmethod record);

    List<Shippingmethod> selectByExample(ShippingmethodExample example);

    Shippingmethod selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Shippingmethod record, @Param("example") ShippingmethodExample example);

    int updateByExample(@Param("record") Shippingmethod record, @Param("example") ShippingmethodExample example);

    int updateByPrimaryKeySelective(Shippingmethod record);

    int updateByPrimaryKey(Shippingmethod record);
}