package com.LeXiang.mapper;

import com.LeXiang.pojo.Deliverycenter;
import com.LeXiang.pojo.DeliverycenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverycenterMapper {
    int countByExample(DeliverycenterExample example);

    int deleteByExample(DeliverycenterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Deliverycenter record);

    int insertSelective(Deliverycenter record);

    List<Deliverycenter> selectByExample(DeliverycenterExample example);

    Deliverycenter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Deliverycenter record, @Param("example") DeliverycenterExample example);

    int updateByExample(@Param("record") Deliverycenter record, @Param("example") DeliverycenterExample example);

    int updateByPrimaryKeySelective(Deliverycenter record);

    int updateByPrimaryKey(Deliverycenter record);
}