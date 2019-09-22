package com.LeXiang.mapper;

import com.LeXiang.pojo.Svc;
import com.LeXiang.pojo.SvcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SvcMapper {
    int countByExample(SvcExample example);

    int deleteByExample(SvcExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Svc record);

    int insertSelective(Svc record);

    List<Svc> selectByExample(SvcExample example);

    Svc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Svc record, @Param("example") SvcExample example);

    int updateByExample(@Param("record") Svc record, @Param("example") SvcExample example);

    int updateByPrimaryKeySelective(Svc record);

    int updateByPrimaryKey(Svc record);
}