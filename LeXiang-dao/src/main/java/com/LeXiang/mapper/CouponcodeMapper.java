package com.LeXiang.mapper;

import com.LeXiang.pojo.Couponcode;
import com.LeXiang.pojo.CouponcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponcodeMapper {
    int countByExample(CouponcodeExample example);

    int deleteByExample(CouponcodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Couponcode record);

    int insertSelective(Couponcode record);

    List<Couponcode> selectByExample(CouponcodeExample example);

    Couponcode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Couponcode record, @Param("example") CouponcodeExample example);

    int updateByExample(@Param("record") Couponcode record, @Param("example") CouponcodeExample example);

    int updateByPrimaryKeySelective(Couponcode record);

    int updateByPrimaryKey(Couponcode record);
}