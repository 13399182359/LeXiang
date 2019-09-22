package com.LeXiang.mapper;

import com.LeXiang.pojo.ProductStoreproducttagExample;
import com.LeXiang.pojo.ProductStoreproducttagKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductStoreproducttagMapper {
    int countByExample(ProductStoreproducttagExample example);

    int deleteByExample(ProductStoreproducttagExample example);

    int deleteByPrimaryKey(ProductStoreproducttagKey key);

    int insert(ProductStoreproducttagKey record);

    int insertSelective(ProductStoreproducttagKey record);

    List<ProductStoreproducttagKey> selectByExample(ProductStoreproducttagExample example);

    int updateByExampleSelective(@Param("record") ProductStoreproducttagKey record, @Param("example") ProductStoreproducttagExample example);

    int updateByExample(@Param("record") ProductStoreproducttagKey record, @Param("example") ProductStoreproducttagExample example);
}