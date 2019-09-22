package com.LeXiang.mapper;

import com.LeXiang.pojo.Productnotify;
import com.LeXiang.pojo.ProductnotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductnotifyMapper {
    int countByExample(ProductnotifyExample example);

    int deleteByExample(ProductnotifyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Productnotify record);

    int insertSelective(Productnotify record);

    List<Productnotify> selectByExample(ProductnotifyExample example);

    Productnotify selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Productnotify record, @Param("example") ProductnotifyExample example);

    int updateByExample(@Param("record") Productnotify record, @Param("example") ProductnotifyExample example);

    int updateByPrimaryKeySelective(Productnotify record);

    int updateByPrimaryKey(Productnotify record);
}