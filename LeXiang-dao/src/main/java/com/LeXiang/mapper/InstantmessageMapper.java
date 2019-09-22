package com.LeXiang.mapper;

import com.LeXiang.pojo.Instantmessage;
import com.LeXiang.pojo.InstantmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstantmessageMapper {
    int countByExample(InstantmessageExample example);

    int deleteByExample(InstantmessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Instantmessage record);

    int insertSelective(Instantmessage record);

    List<Instantmessage> selectByExample(InstantmessageExample example);

    Instantmessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Instantmessage record, @Param("example") InstantmessageExample example);

    int updateByExample(@Param("record") Instantmessage record, @Param("example") InstantmessageExample example);

    int updateByPrimaryKeySelective(Instantmessage record);

    int updateByPrimaryKey(Instantmessage record);
}