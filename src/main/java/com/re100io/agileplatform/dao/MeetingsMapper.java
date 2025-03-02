package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.Meetings;
import com.re100io.agileplatform.entity.MeetingsExample;
import com.re100io.agileplatform.entity.MeetingsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingsMapper {
    long countByExample(MeetingsExample example);

    int deleteByExample(MeetingsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MeetingsWithBLOBs record);

    int insertSelective(MeetingsWithBLOBs record);

    List<MeetingsWithBLOBs> selectByExampleWithBLOBs(MeetingsExample example);

    List<Meetings> selectByExample(MeetingsExample example);

    MeetingsWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MeetingsWithBLOBs record, @Param("example") MeetingsExample example);

    int updateByExampleWithBLOBs(@Param("record") MeetingsWithBLOBs record, @Param("example") MeetingsExample example);

    int updateByExample(@Param("record") Meetings record, @Param("example") MeetingsExample example);

    int updateByPrimaryKeySelective(MeetingsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MeetingsWithBLOBs record);

    int updateByPrimaryKey(Meetings record);
}