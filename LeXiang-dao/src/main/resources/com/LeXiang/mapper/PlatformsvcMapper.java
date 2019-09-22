package com.LeXiang.mapper;

import com.LeXiang.pojo.Platformsvc;
import com.LeXiang.pojo.PlatformsvcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatformsvcMapper {
    int countByExample(PlatformsvcExample example);

    int deleteByExample(PlatformsvcExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Platformsvc record);

    int insertSelective(Platformsvc record);

    List<Platformsvc> selectByExample(PlatformsvcExample example);

    int updateByExampleSelective(@Param("record") Platformsvc record, @Param("example") PlatformsvcExample example);

    int updateByExample(@Param("record") Platformsvc record, @Param("example") PlatformsvcExample example);
}