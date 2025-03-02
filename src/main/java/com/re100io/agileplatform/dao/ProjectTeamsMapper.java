package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.ProjectTeams;
import com.re100io.agileplatform.entity.ProjectTeamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectTeamsMapper {
    long countByExample(ProjectTeamsExample example);

    int deleteByExample(ProjectTeamsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectTeams record);

    int insertSelective(ProjectTeams record);

    List<ProjectTeams> selectByExample(ProjectTeamsExample example);

    ProjectTeams selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectTeams record, @Param("example") ProjectTeamsExample example);

    int updateByExample(@Param("record") ProjectTeams record, @Param("example") ProjectTeamsExample example);

    int updateByPrimaryKeySelective(ProjectTeams record);

    int updateByPrimaryKey(ProjectTeams record);
}