package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.Projects;
import com.re100io.agileplatform.entity.ProjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectsMapper {
    long countByExample(ProjectsExample example);

    int deleteByExample(ProjectsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Projects record);

    int insertSelective(Projects record);

    List<Projects> selectByExampleWithBLOBs(ProjectsExample example);

    List<Projects> selectByExample(ProjectsExample example);

    Projects selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Projects record, @Param("example") ProjectsExample example);

    int updateByExampleWithBLOBs(@Param("record") Projects record, @Param("example") ProjectsExample example);

    int updateByExample(@Param("record") Projects record, @Param("example") ProjectsExample example);

    int updateByPrimaryKeySelective(Projects record);

    int updateByPrimaryKeyWithBLOBs(Projects record);

    int updateByPrimaryKey(Projects record);
}