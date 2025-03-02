package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.Organizations;
import com.re100io.agileplatform.entity.OrganizationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationsMapper {
    long countByExample(OrganizationsExample example);

    int deleteByExample(OrganizationsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Organizations record);

    int insertSelective(Organizations record);

    List<Organizations> selectByExampleWithBLOBs(OrganizationsExample example);

    List<Organizations> selectByExample(OrganizationsExample example);

    Organizations selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Organizations record, @Param("example") OrganizationsExample example);

    int updateByExampleWithBLOBs(@Param("record") Organizations record, @Param("example") OrganizationsExample example);

    int updateByExample(@Param("record") Organizations record, @Param("example") OrganizationsExample example);

    int updateByPrimaryKeySelective(Organizations record);

    int updateByPrimaryKeyWithBLOBs(Organizations record);

    int updateByPrimaryKey(Organizations record);
}