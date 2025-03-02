package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.ProjectMembers;
import com.re100io.agileplatform.entity.ProjectMembersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectMembersMapper {
    long countByExample(ProjectMembersExample example);

    int deleteByExample(ProjectMembersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectMembers record);

    int insertSelective(ProjectMembers record);

    List<ProjectMembers> selectByExample(ProjectMembersExample example);

    ProjectMembers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectMembers record, @Param("example") ProjectMembersExample example);

    int updateByExample(@Param("record") ProjectMembers record, @Param("example") ProjectMembersExample example);

    int updateByPrimaryKeySelective(ProjectMembers record);

    int updateByPrimaryKey(ProjectMembers record);
}