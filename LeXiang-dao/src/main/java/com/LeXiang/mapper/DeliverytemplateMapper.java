package com.LeXiang.mapper;

import com.LeXiang.pojo.Deliverytemplate;
import com.LeXiang.pojo.DeliverytemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverytemplateMapper {
    int countByExample(DeliverytemplateExample example);

    int deleteByExample(DeliverytemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Deliverytemplate record);

    int insertSelective(Deliverytemplate record);

    List<Deliverytemplate> selectByExampleWithBLOBs(DeliverytemplateExample example);

    List<Deliverytemplate> selectByExample(DeliverytemplateExample example);

    Deliverytemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Deliverytemplate record, @Param("example") DeliverytemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") Deliverytemplate record, @Param("example") DeliverytemplateExample example);

    int updateByExample(@Param("record") Deliverytemplate record, @Param("example") DeliverytemplateExample example);

    int updateByPrimaryKeySelective(Deliverytemplate record);

    int updateByPrimaryKeyWithBLOBs(Deliverytemplate record);

    int updateByPrimaryKey(Deliverytemplate record);
}