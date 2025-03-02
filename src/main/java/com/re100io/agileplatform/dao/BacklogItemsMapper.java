package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.BacklogItems;
import com.re100io.agileplatform.entity.BacklogItemsExample;
import com.re100io.agileplatform.entity.BacklogItemsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BacklogItemsMapper {
    long countByExample(BacklogItemsExample example);

    int deleteByExample(BacklogItemsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BacklogItemsWithBLOBs record);

    int insertSelective(BacklogItemsWithBLOBs record);

    List<BacklogItemsWithBLOBs> selectByExampleWithBLOBs(BacklogItemsExample example);

    List<BacklogItems> selectByExample(BacklogItemsExample example);

    BacklogItemsWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BacklogItemsWithBLOBs record, @Param("example") BacklogItemsExample example);

    int updateByExampleWithBLOBs(@Param("record") BacklogItemsWithBLOBs record, @Param("example") BacklogItemsExample example);

    int updateByExample(@Param("record") BacklogItems record, @Param("example") BacklogItemsExample example);

    int updateByPrimaryKeySelective(BacklogItemsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BacklogItemsWithBLOBs record);

    int updateByPrimaryKey(BacklogItems record);
}