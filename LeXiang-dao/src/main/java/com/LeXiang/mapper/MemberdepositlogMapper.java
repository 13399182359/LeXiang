package com.LeXiang.mapper;

import com.LeXiang.pojo.Memberdepositlog;
import com.LeXiang.pojo.MemberdepositlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberdepositlogMapper {
    int countByExample(MemberdepositlogExample example);

    int deleteByExample(MemberdepositlogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Memberdepositlog record);

    int insertSelective(Memberdepositlog record);

    List<Memberdepositlog> selectByExample(MemberdepositlogExample example);

    Memberdepositlog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Memberdepositlog record, @Param("example") MemberdepositlogExample example);

    int updateByExample(@Param("record") Memberdepositlog record, @Param("example") MemberdepositlogExample example);

    int updateByPrimaryKeySelective(Memberdepositlog record);

    int updateByPrimaryKey(Memberdepositlog record);
}