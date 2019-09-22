package com.LeXiang.mapper;

import com.LeXiang.pojo.Storefavorite;
import com.LeXiang.pojo.StorefavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorefavoriteMapper {
    int countByExample(StorefavoriteExample example);

    int deleteByExample(StorefavoriteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Storefavorite record);

    int insertSelective(Storefavorite record);

    List<Storefavorite> selectByExample(StorefavoriteExample example);

    Storefavorite selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Storefavorite record, @Param("example") StorefavoriteExample example);

    int updateByExample(@Param("record") Storefavorite record, @Param("example") StorefavoriteExample example);

    int updateByPrimaryKeySelective(Storefavorite record);

    int updateByPrimaryKey(Storefavorite record);
}