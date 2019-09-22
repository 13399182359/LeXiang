package com.LeXiang.mapper;

import com.LeXiang.pojo.Cash;
import com.LeXiang.pojo.CashExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashMapper {
    int countByExample(CashExample example);

    int deleteByExample(CashExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Cash record);

    int insertSelective(Cash record);

    List<Cash> selectByExample(CashExample example);

    Cash selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Cash record, @Param("example") CashExample example);

    int updateByExample(@Param("record") Cash record, @Param("example") CashExample example);

    int updateByPrimaryKeySelective(Cash record);

    int updateByPrimaryKey(Cash record);
}