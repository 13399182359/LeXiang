package com.LeXiang.mapper;

import com.LeXiang.pojo.Promotion;
import com.LeXiang.pojo.PromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionMapper {
    int countByExample(PromotionExample example);

    int deleteByExample(PromotionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Promotion record);

    int insertSelective(Promotion record);

    List<Promotion> selectByExampleWithBLOBs(PromotionExample example);

    List<Promotion> selectByExample(PromotionExample example);

    Promotion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Promotion record, @Param("example") PromotionExample example);

    int updateByExampleWithBLOBs(@Param("record") Promotion record, @Param("example") PromotionExample example);

    int updateByExample(@Param("record") Promotion record, @Param("example") PromotionExample example);

    int updateByPrimaryKeySelective(Promotion record);

    int updateByPrimaryKeyWithBLOBs(Promotion record);

    int updateByPrimaryKey(Promotion record);
}