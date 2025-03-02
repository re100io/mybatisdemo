package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.BacklogItemTags;
import com.re100io.agileplatform.entity.BacklogItemTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BacklogItemTagsMapper {
    long countByExample(BacklogItemTagsExample example);

    int deleteByExample(BacklogItemTagsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BacklogItemTags record);

    int insertSelective(BacklogItemTags record);

    List<BacklogItemTags> selectByExample(BacklogItemTagsExample example);

    BacklogItemTags selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BacklogItemTags record, @Param("example") BacklogItemTagsExample example);

    int updateByExample(@Param("record") BacklogItemTags record, @Param("example") BacklogItemTagsExample example);

    int updateByPrimaryKeySelective(BacklogItemTags record);

    int updateByPrimaryKey(BacklogItemTags record);
}