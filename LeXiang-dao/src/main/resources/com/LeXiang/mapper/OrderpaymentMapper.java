package com.LeXiang.mapper;

import com.LeXiang.pojo.Orderpayment;
import com.LeXiang.pojo.OrderpaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderpaymentMapper {
    int countByExample(OrderpaymentExample example);

    int deleteByExample(OrderpaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Orderpayment record);

    int insertSelective(Orderpayment record);

    List<Orderpayment> selectByExample(OrderpaymentExample example);

    Orderpayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Orderpayment record, @Param("example") OrderpaymentExample example);

    int updateByExample(@Param("record") Orderpayment record, @Param("example") OrderpaymentExample example);

    int updateByPrimaryKeySelective(Orderpayment record);

    int updateByPrimaryKey(Orderpayment record);
}