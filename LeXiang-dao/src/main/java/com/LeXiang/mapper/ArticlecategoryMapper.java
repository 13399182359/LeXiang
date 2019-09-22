package com.LeXiang.mapper;

import com.LeXiang.pojo.Articlecategory;
import com.LeXiang.pojo.ArticlecategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticlecategoryMapper {
    int countByExample(ArticlecategoryExample example);

    int deleteByExample(ArticlecategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Articlecategory record);

    int insertSelective(Articlecategory record);

    List<Articlecategory> selectByExample(ArticlecategoryExample example);

    Articlecategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Articlecategory record, @Param("example") ArticlecategoryExample example);

    int updateByExample(@Param("record") Articlecategory record, @Param("example") ArticlecategoryExample example);

    int updateByPrimaryKeySelective(Articlecategory record);

    int updateByPrimaryKey(Articlecategory record);
}