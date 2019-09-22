package com.LeXiang.mapper;

import com.LeXiang.pojo.Paymentmethod;
import com.LeXiang.pojo.PaymentmethodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentmethodMapper {
    int countByExample(PaymentmethodExample example);

    int deleteByExample(PaymentmethodExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Paymentmethod record);

    int insertSelective(Paymentmethod record);

    List<Paymentmethod> selectByExampleWithBLOBs(PaymentmethodExample example);

    List<Paymentmethod> selectByExample(PaymentmethodExample example);

    Paymentmethod selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Paymentmethod record, @Param("example") PaymentmethodExample example);

    int updateByExampleWithBLOBs(@Param("record") Paymentmethod record, @Param("example") PaymentmethodExample example);

    int updateByExample(@Param("record") Paymentmethod record, @Param("example") PaymentmethodExample example);

    int updateByPrimaryKeySelective(Paymentmethod record);

    int updateByPrimaryKeyWithBLOBs(Paymentmethod record);

    int updateByPrimaryKey(Paymentmethod record);
}