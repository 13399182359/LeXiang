package com.LeXiang.mapper;

import com.LeXiang.pojo.ProductcategoryPromotionExample;
import com.LeXiang.pojo.ProductcategoryPromotionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductcategoryPromotionMapper {
    int countByExample(ProductcategoryPromotionExample example);

    int deleteByExample(ProductcategoryPromotionExample example);

    int deleteByPrimaryKey(ProductcategoryPromotionKey key);

    int insert(ProductcategoryPromotionKey record);

    int insertSelective(ProductcategoryPromotionKey record);

    List<ProductcategoryPromotionKey> selectByExample(ProductcategoryPromotionExample example);

    int updateByExampleSelective(@Param("record") ProductcategoryPromotionKey record, @Param("example") ProductcategoryPromotionExample example);

    int updateByExample(@Param("record") ProductcategoryPromotionKey record, @Param("example") ProductcategoryPromotionExample example);
}