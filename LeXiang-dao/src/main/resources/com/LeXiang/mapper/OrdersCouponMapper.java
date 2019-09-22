package com.LeXiang.mapper;

import com.LeXiang.pojo.OrdersCoupon;
import com.LeXiang.pojo.OrdersCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersCouponMapper {
    int countByExample(OrdersCouponExample example);

    int deleteByExample(OrdersCouponExample example);

    int insert(OrdersCoupon record);

    int insertSelective(OrdersCoupon record);

    List<OrdersCoupon> selectByExample(OrdersCouponExample example);

    int updateByExampleSelective(@Param("record") OrdersCoupon record, @Param("example") OrdersCouponExample example);

    int updateByExample(@Param("record") OrdersCoupon record, @Param("example") OrdersCouponExample example);
}