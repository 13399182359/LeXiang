package com.LeXiang.mapper;

import com.LeXiang.pojo.Businessdepositlog;
import com.LeXiang.pojo.BusinessdepositlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessdepositlogMapper {
    int countByExample(BusinessdepositlogExample example);

    int deleteByExample(BusinessdepositlogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Businessdepositlog record);

    int insertSelective(Businessdepositlog record);

    List<Businessdepositlog> selectByExample(BusinessdepositlogExample example);

    Businessdepositlog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Businessdepositlog record, @Param("example") BusinessdepositlogExample example);

    int updateByExample(@Param("record") Businessdepositlog record, @Param("example") BusinessdepositlogExample example);

    int updateByPrimaryKeySelective(Businessdepositlog record);

    int updateByPrimaryKey(Businessdepositlog record);
}