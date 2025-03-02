package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.Sprints;
import com.re100io.agileplatform.entity.SprintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprintsMapper {
    long countByExample(SprintsExample example);

    int deleteByExample(SprintsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sprints record);

    int insertSelective(Sprints record);

    List<Sprints> selectByExampleWithBLOBs(SprintsExample example);

    List<Sprints> selectByExample(SprintsExample example);

    Sprints selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sprints record, @Param("example") SprintsExample example);

    int updateByExampleWithBLOBs(@Param("record") Sprints record, @Param("example") SprintsExample example);

    int updateByExample(@Param("record") Sprints record, @Param("example") SprintsExample example);

    int updateByPrimaryKeySelective(Sprints record);

    int updateByPrimaryKeyWithBLOBs(Sprints record);

    int updateByPrimaryKey(Sprints record);
}