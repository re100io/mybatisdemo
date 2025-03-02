package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.Teams;
import com.re100io.agileplatform.entity.TeamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamsMapper {
    long countByExample(TeamsExample example);

    int deleteByExample(TeamsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Teams record);

    int insertSelective(Teams record);

    List<Teams> selectByExampleWithBLOBs(TeamsExample example);

    List<Teams> selectByExample(TeamsExample example);

    Teams selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Teams record, @Param("example") TeamsExample example);

    int updateByExampleWithBLOBs(@Param("record") Teams record, @Param("example") TeamsExample example);

    int updateByExample(@Param("record") Teams record, @Param("example") TeamsExample example);

    int updateByPrimaryKeySelective(Teams record);

    int updateByPrimaryKeyWithBLOBs(Teams record);

    int updateByPrimaryKey(Teams record);
}