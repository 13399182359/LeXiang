package com.LeXiang.mapper;

import com.LeXiang.pojo.Storecategory;
import com.LeXiang.pojo.StorecategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorecategoryMapper {
    int countByExample(StorecategoryExample example);

    int deleteByExample(StorecategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Storecategory record);

    int insertSelective(Storecategory record);

    List<Storecategory> selectByExample(StorecategoryExample example);

    Storecategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Storecategory record, @Param("example") StorecategoryExample example);

    int updateByExample(@Param("record") Storecategory record, @Param("example") StorecategoryExample example);

    int updateByPrimaryKeySelective(Storecategory record);

    int updateByPrimaryKey(Storecategory record);
}