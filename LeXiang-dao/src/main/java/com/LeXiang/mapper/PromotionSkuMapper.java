package com.LeXiang.mapper;

import com.LeXiang.pojo.PromotionSkuExample;
import com.LeXiang.pojo.PromotionSkuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionSkuMapper {
    int countByExample(PromotionSkuExample example);

    int deleteByExample(PromotionSkuExample example);

    int deleteByPrimaryKey(PromotionSkuKey key);

    int insert(PromotionSkuKey record);

    int insertSelective(PromotionSkuKey record);

    List<PromotionSkuKey> selectByExample(PromotionSkuExample example);

    int updateByExampleSelective(@Param("record") PromotionSkuKey record, @Param("example") PromotionSkuExample example);

    int updateByExample(@Param("record") PromotionSkuKey record, @Param("example") PromotionSkuExample example);
}