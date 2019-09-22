package com.LeXiang.mapper;

import com.LeXiang.pojo.Receiver;
import com.LeXiang.pojo.ReceiverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiverMapper {
    int countByExample(ReceiverExample example);

    int deleteByExample(ReceiverExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Receiver record);

    int insertSelective(Receiver record);

    List<Receiver> selectByExample(ReceiverExample example);

    Receiver selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Receiver record, @Param("example") ReceiverExample example);

    int updateByExample(@Param("record") Receiver record, @Param("example") ReceiverExample example);

    int updateByPrimaryKeySelective(Receiver record);

    int updateByPrimaryKey(Receiver record);
}