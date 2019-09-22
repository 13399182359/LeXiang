package com.LeXiang.mapper;

import com.LeXiang.pojo.Specification;
import com.LeXiang.pojo.SpecificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecificationMapper {
    int countByExample(SpecificationExample example);

    int deleteByExample(SpecificationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Specification record);

    int insertSelective(Specification record);

    List<Specification> selectByExampleWithBLOBs(SpecificationExample example);

    List<Specification> selectByExample(SpecificationExample example);

    Specification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Specification record, @Param("example") SpecificationExample example);

    int updateByExampleWithBLOBs(@Param("record") Specification record, @Param("example") SpecificationExample example);

    int updateByExample(@Param("record") Specification record, @Param("example") SpecificationExample example);

    int updateByPrimaryKeySelective(Specification record);

    int updateByPrimaryKeyWithBLOBs(Specification record);

    int updateByPrimaryKey(Specification record);
}