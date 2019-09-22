package com.LeXiang.mapper;

import com.LeXiang.pojo.Orderitem;
import com.LeXiang.pojo.OrderitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderitemMapper {
    int countByExample(OrderitemExample example);

    int deleteByExample(OrderitemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Orderitem record);

    int insertSelective(Orderitem record);

    List<Orderitem> selectByExampleWithBLOBs(OrderitemExample example);

    List<Orderitem> selectByExample(OrderitemExample example);

    Orderitem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Orderitem record, @Param("example") OrderitemExample example);

    int updateByExampleWithBLOBs(@Param("record") Orderitem record, @Param("example") OrderitemExample example);

    int updateByExample(@Param("record") Orderitem record, @Param("example") OrderitemExample example);

    int updateByPrimaryKeySelective(Orderitem record);

    int updateByPrimaryKeyWithBLOBs(Orderitem record);

    int updateByPrimaryKey(Orderitem record);
}