package com.LeXiang.mapper;

import com.LeXiang.pojo.StoreProductcategoryIdExample;
import com.LeXiang.pojo.StoreProductcategoryIdKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreProductcategoryIdMapper {
    int countByExample(StoreProductcategoryIdExample example);

    int deleteByExample(StoreProductcategoryIdExample example);

    int deleteByPrimaryKey(StoreProductcategoryIdKey key);

    int insert(StoreProductcategoryIdKey record);

    int insertSelective(StoreProductcategoryIdKey record);

    List<StoreProductcategoryIdKey> selectByExample(StoreProductcategoryIdExample example);

    int updateByExampleSelective(@Param("record") StoreProductcategoryIdKey record, @Param("example") StoreProductcategoryIdExample example);

    int updateByExample(@Param("record") StoreProductcategoryIdKey record, @Param("example") StoreProductcategoryIdExample example);
}