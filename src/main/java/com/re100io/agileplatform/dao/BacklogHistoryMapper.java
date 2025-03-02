package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.BacklogHistory;
import com.re100io.agileplatform.entity.BacklogHistoryExample;
import com.re100io.agileplatform.entity.BacklogHistoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BacklogHistoryMapper {
    long countByExample(BacklogHistoryExample example);

    int deleteByExample(BacklogHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BacklogHistoryWithBLOBs record);

    int insertSelective(BacklogHistoryWithBLOBs record);

    List<BacklogHistoryWithBLOBs> selectByExampleWithBLOBs(BacklogHistoryExample example);

    List<BacklogHistory> selectByExample(BacklogHistoryExample example);

    BacklogHistoryWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BacklogHistoryWithBLOBs record, @Param("example") BacklogHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") BacklogHistoryWithBLOBs record, @Param("example") BacklogHistoryExample example);

    int updateByExample(@Param("record") BacklogHistory record, @Param("example") BacklogHistoryExample example);

    int updateByPrimaryKeySelective(BacklogHistoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BacklogHistoryWithBLOBs record);

    int updateByPrimaryKey(BacklogHistory record);
}