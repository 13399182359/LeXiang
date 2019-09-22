package com.LeXiang.mapper;

import com.LeXiang.pojo.Socialuser;
import com.LeXiang.pojo.SocialuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocialuserMapper {
    int countByExample(SocialuserExample example);

    int deleteByExample(SocialuserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Socialuser record);

    int insertSelective(Socialuser record);

    List<Socialuser> selectByExample(SocialuserExample example);

    Socialuser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Socialuser record, @Param("example") SocialuserExample example);

    int updateByExample(@Param("record") Socialuser record, @Param("example") SocialuserExample example);

    int updateByPrimaryKeySelective(Socialuser record);

    int updateByPrimaryKey(Socialuser record);
}