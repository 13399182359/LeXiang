package com.LeXiang.mapper;

import com.LeXiang.pojo.Auditlog;
import com.LeXiang.pojo.AuditlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditlogMapper {
    int countByExample(AuditlogExample example);

    int deleteByExample(AuditlogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Auditlog record);

    int insertSelective(Auditlog record);

    List<Auditlog> selectByExampleWithBLOBs(AuditlogExample example);

    List<Auditlog> selectByExample(AuditlogExample example);

    Auditlog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Auditlog record, @Param("example") AuditlogExample example);

    int updateByExampleWithBLOBs(@Param("record") Auditlog record, @Param("example") AuditlogExample example);

    int updateByExample(@Param("record") Auditlog record, @Param("example") AuditlogExample example);

    int updateByPrimaryKeySelective(Auditlog record);

    int updateByPrimaryKeyWithBLOBs(Auditlog record);

    int updateByPrimaryKey(Auditlog record);
}