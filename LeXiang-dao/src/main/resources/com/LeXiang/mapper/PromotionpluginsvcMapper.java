package com.LeXiang.mapper;

import com.LeXiang.pojo.Promotionpluginsvc;
import com.LeXiang.pojo.PromotionpluginsvcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionpluginsvcMapper {
    int countByExample(PromotionpluginsvcExample example);

    int deleteByExample(PromotionpluginsvcExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Promotionpluginsvc record);

    int insertSelective(Promotionpluginsvc record);

    List<Promotionpluginsvc> selectByExample(PromotionpluginsvcExample example);

    Promotionpluginsvc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Promotionpluginsvc record, @Param("example") PromotionpluginsvcExample example);

    int updateByExample(@Param("record") Promotionpluginsvc record, @Param("example") PromotionpluginsvcExample example);

    int updateByPrimaryKeySelective(Promotionpluginsvc record);

    int updateByPrimaryKey(Promotionpluginsvc record);
}