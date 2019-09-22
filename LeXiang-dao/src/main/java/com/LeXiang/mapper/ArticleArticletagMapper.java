package com.LeXiang.mapper;

import com.LeXiang.pojo.ArticleArticletagExample;
import com.LeXiang.pojo.ArticleArticletagKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleArticletagMapper {
    int countByExample(ArticleArticletagExample example);

    int deleteByExample(ArticleArticletagExample example);

    int deleteByPrimaryKey(ArticleArticletagKey key);

    int insert(ArticleArticletagKey record);

    int insertSelective(ArticleArticletagKey record);

    List<ArticleArticletagKey> selectByExample(ArticleArticletagExample example);

    int updateByExampleSelective(@Param("record") ArticleArticletagKey record, @Param("example") ArticleArticletagExample example);

    int updateByExample(@Param("record") ArticleArticletagKey record, @Param("example") ArticleArticletagExample example);
}