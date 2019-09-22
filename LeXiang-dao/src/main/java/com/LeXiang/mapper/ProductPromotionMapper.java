package com.LeXiang.mapper;

import com.LeXiang.pojo.ProductPromotionExample;
import com.LeXiang.pojo.ProductPromotionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductPromotionMapper {
    int countByExample(ProductPromotionExample example);

    int deleteByExample(ProductPromotionExample example);

    int deleteByPrimaryKey(ProductPromotionKey key);

    int insert(ProductPromotionKey record);

    int insertSelective(ProductPromotionKey record);

    List<ProductPromotionKey> selectByExample(ProductPromotionExample example);

    int updateByExampleSelective(@Param("record") ProductPromotionKey record, @Param("example") ProductPromotionExample example);

    int updateByExample(@Param("record") ProductPromotionKey record, @Param("example") ProductPromotionExample example);
}