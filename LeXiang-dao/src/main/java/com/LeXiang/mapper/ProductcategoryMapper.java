package com.LeXiang.mapper;

import com.LeXiang.pojo.Productcategory;
import com.LeXiang.pojo.ProductcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductcategoryMapper {
    int countByExample(ProductcategoryExample example);

    int deleteByExample(ProductcategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Productcategory record);

    int insertSelective(Productcategory record);

    List<Productcategory> selectByExample(ProductcategoryExample example);

    Productcategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Productcategory record, @Param("example") ProductcategoryExample example);

    int updateByExample(@Param("record") Productcategory record, @Param("example") ProductcategoryExample example);

    int updateByPrimaryKeySelective(Productcategory record);

    int updateByPrimaryKey(Productcategory record);
}