package com.LeXiang.mapper;

import com.LeXiang.pojo.PromotionMemberrankExample;
import com.LeXiang.pojo.PromotionMemberrankKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionMemberrankMapper {
    int countByExample(PromotionMemberrankExample example);

    int deleteByExample(PromotionMemberrankExample example);

    int deleteByPrimaryKey(PromotionMemberrankKey key);

    int insert(PromotionMemberrankKey record);

    int insertSelective(PromotionMemberrankKey record);

    List<PromotionMemberrankKey> selectByExample(PromotionMemberrankExample example);

    int updateByExampleSelective(@Param("record") PromotionMemberrankKey record, @Param("example") PromotionMemberrankExample example);

    int updateByExample(@Param("record") PromotionMemberrankKey record, @Param("example") PromotionMemberrankExample example);
}