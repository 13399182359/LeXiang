package com.LeXiang.mapper;

import com.LeXiang.pojo.Seo;
import com.LeXiang.pojo.SeoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeoMapper {
    int countByExample(SeoExample example);

    int deleteByExample(SeoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Seo record);

    int insertSelective(Seo record);

    List<Seo> selectByExample(SeoExample example);

    Seo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Seo record, @Param("example") SeoExample example);

    int updateByExample(@Param("record") Seo record, @Param("example") SeoExample example);

    int updateByPrimaryKeySelective(Seo record);

    int updateByPrimaryKey(Seo record);
}