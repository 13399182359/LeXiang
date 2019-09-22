package com.LeXiang.mapper;

import com.LeXiang.pojo.ProductcategoryBrandExample;
import com.LeXiang.pojo.ProductcategoryBrandKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductcategoryBrandMapper {
    int countByExample(ProductcategoryBrandExample example);

    int deleteByExample(ProductcategoryBrandExample example);

    int deleteByPrimaryKey(ProductcategoryBrandKey key);

    int insert(ProductcategoryBrandKey record);

    int insertSelective(ProductcategoryBrandKey record);

    List<ProductcategoryBrandKey> selectByExample(ProductcategoryBrandExample example);

    int updateByExampleSelective(@Param("record") ProductcategoryBrandKey record, @Param("example") ProductcategoryBrandExample example);

    int updateByExample(@Param("record") ProductcategoryBrandKey record, @Param("example") ProductcategoryBrandExample example);
}