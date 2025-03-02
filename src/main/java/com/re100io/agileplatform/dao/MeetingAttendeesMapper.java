package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.MeetingAttendees;
import com.re100io.agileplatform.entity.MeetingAttendeesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingAttendeesMapper {
    long countByExample(MeetingAttendeesExample example);

    int deleteByExample(MeetingAttendeesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MeetingAttendees record);

    int insertSelective(MeetingAttendees record);

    List<MeetingAttendees> selectByExample(MeetingAttendeesExample example);

    MeetingAttendees selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MeetingAttendees record, @Param("example") MeetingAttendeesExample example);

    int updateByExample(@Param("record") MeetingAttendees record, @Param("example") MeetingAttendeesExample example);

    int updateByPrimaryKeySelective(MeetingAttendees record);

    int updateByPrimaryKey(MeetingAttendees record);
}