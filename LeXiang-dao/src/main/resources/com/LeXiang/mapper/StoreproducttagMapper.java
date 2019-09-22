package com.LeXiang.mapper;

import com.LeXiang.pojo.Storeproducttag;
import com.LeXiang.pojo.StoreproducttagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreproducttagMapper {
    int countByExample(StoreproducttagExample example);

    int deleteByExample(StoreproducttagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Storeproducttag record);

    int insertSelective(Storeproducttag record);

    List<Storeproducttag> selectByExample(StoreproducttagExample example);

    Storeproducttag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Storeproducttag record, @Param("example") StoreproducttagExample example);

    int updateByExample(@Param("record") Storeproducttag record, @Param("example") StoreproducttagExample example);

    int updateByPrimaryKeySelective(Storeproducttag record);

    int updateByPrimaryKey(Storeproducttag record);
}