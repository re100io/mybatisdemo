package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.TeamMembers;
import com.re100io.agileplatform.entity.TeamMembersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamMembersMapper {
    long countByExample(TeamMembersExample example);

    int deleteByExample(TeamMembersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TeamMembers record);

    int insertSelective(TeamMembers record);

    List<TeamMembers> selectByExample(TeamMembersExample example);

    TeamMembers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TeamMembers record, @Param("example") TeamMembersExample example);

    int updateByExample(@Param("record") TeamMembers record, @Param("example") TeamMembersExample example);

    int updateByPrimaryKeySelective(TeamMembers record);

    int updateByPrimaryKey(TeamMembers record);
}