package com.LeXiang.mapper;

import com.LeXiang.pojo.Friendlink;
import com.LeXiang.pojo.FriendlinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendlinkMapper {
    int countByExample(FriendlinkExample example);

    int deleteByExample(FriendlinkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Friendlink record);

    int insertSelective(Friendlink record);

    List<Friendlink> selectByExample(FriendlinkExample example);

    Friendlink selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Friendlink record, @Param("example") FriendlinkExample example);

    int updateByExample(@Param("record") Friendlink record, @Param("example") FriendlinkExample example);

    int updateByPrimaryKeySelective(Friendlink record);

    int updateByPrimaryKey(Friendlink record);
}