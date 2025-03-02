package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.OrganizationMembers;
import com.re100io.agileplatform.entity.OrganizationMembersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationMembersMapper {
    long countByExample(OrganizationMembersExample example);

    int deleteByExample(OrganizationMembersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrganizationMembers record);

    int insertSelective(OrganizationMembers record);

    List<OrganizationMembers> selectByExample(OrganizationMembersExample example);

    OrganizationMembers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrganizationMembers record, @Param("example") OrganizationMembersExample example);

    int updateByExample(@Param("record") OrganizationMembers record, @Param("example") OrganizationMembersExample example);

    int updateByPrimaryKeySelective(OrganizationMembers record);

    int updateByPrimaryKey(OrganizationMembers record);
}