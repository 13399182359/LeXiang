package com.LeXiang.mapper;

import com.LeXiang.pojo.Paymenttransaction;
import com.LeXiang.pojo.PaymenttransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymenttransactionMapper {
    int countByExample(PaymenttransactionExample example);

    int deleteByExample(PaymenttransactionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Paymenttransaction record);

    int insertSelective(Paymenttransaction record);

    List<Paymenttransaction> selectByExample(PaymenttransactionExample example);

    Paymenttransaction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Paymenttransaction record, @Param("example") PaymenttransactionExample example);

    int updateByExample(@Param("record") Paymenttransaction record, @Param("example") PaymenttransactionExample example);

    int updateByPrimaryKeySelective(Paymenttransaction record);

    int updateByPrimaryKey(Paymenttransaction record);
}