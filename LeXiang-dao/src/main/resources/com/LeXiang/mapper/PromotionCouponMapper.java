package com.LeXiang.mapper;

import com.LeXiang.pojo.PromotionCouponExample;
import com.LeXiang.pojo.PromotionCouponKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionCouponMapper {
    int countByExample(PromotionCouponExample example);

    int deleteByExample(PromotionCouponExample example);

    int deleteByPrimaryKey(PromotionCouponKey key);

    int insert(PromotionCouponKey record);

    int insertSelective(PromotionCouponKey record);

    List<PromotionCouponKey> selectByExample(PromotionCouponExample example);

    int updateByExampleSelective(@Param("record") PromotionCouponKey record, @Param("example") PromotionCouponExample example);

    int updateByExample(@Param("record") PromotionCouponKey record, @Param("example") PromotionCouponExample example);
}