package com.re100io.agileplatform.dao;

import com.re100io.agileplatform.entity.Boards;
import com.re100io.agileplatform.entity.BoardsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoardsMapper {
    long countByExample(BoardsExample example);

    int deleteByExample(BoardsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Boards record);

    int insertSelective(Boards record);

    List<Boards> selectByExampleWithBLOBs(BoardsExample example);

    List<Boards> selectByExample(BoardsExample example);

    Boards selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Boards record, @Param("example") BoardsExample example);

    int updateByExampleWithBLOBs(@Param("record") Boards record, @Param("example") BoardsExample example);

    int updateByExample(@Param("record") Boards record, @Param("example") BoardsExample example);

    int updateByPrimaryKeySelective(Boards record);

    int updateByPrimaryKeyWithBLOBs(Boards record);

    int updateByPrimaryKey(Boards record);
}