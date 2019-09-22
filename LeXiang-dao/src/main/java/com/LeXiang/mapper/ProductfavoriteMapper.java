package com.LeXiang.mapper;

import com.LeXiang.pojo.Productfavorite;
import com.LeXiang.pojo.ProductfavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductfavoriteMapper {
    int countByExample(ProductfavoriteExample example);

    int deleteByExample(ProductfavoriteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Productfavorite record);

    int insertSelective(Productfavorite record);

    List<Productfavorite> selectByExample(ProductfavoriteExample example);

    Productfavorite selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Productfavorite record, @Param("example") ProductfavoriteExample example);

    int updateByExample(@Param("record") Productfavorite record, @Param("example") ProductfavoriteExample example);

    int updateByPrimaryKeySelective(Productfavorite record);

    int updateByPrimaryKey(Productfavorite record);
}