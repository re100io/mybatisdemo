package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.Notifications;
import com.re100io.agileplatform.entity.NotificationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotificationsMapper {
    long countByExample(NotificationsExample example);

    int deleteByExample(NotificationsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Notifications record);

    int insertSelective(Notifications record);

    List<Notifications> selectByExampleWithBLOBs(NotificationsExample example);

    List<Notifications> selectByExample(NotificationsExample example);

    Notifications selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Notifications record, @Param("example") NotificationsExample example);

    int updateByExampleWithBLOBs(@Param("record") Notifications record, @Param("example") NotificationsExample example);

    int updateByExample(@Param("record") Notifications record, @Param("example") NotificationsExample example);

    int updateByPrimaryKeySelective(Notifications record);

    int updateByPrimaryKeyWithBLOBs(Notifications record);

    int updateByPrimaryKey(Notifications record);
}