package com.LeXiang.mapper;

import com.LeXiang.pojo.Store;
import com.LeXiang.pojo.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
    int countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExampleWithBLOBs(StoreExample example);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExampleWithBLOBs(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKeyWithBLOBs(Store record);

    int updateByPrimaryKey(Store record);
}