package com.re100io.mybatisdemo.mapper;


import com.re100io.mybatisdemo.model.Work;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WorkMapper {
    void insertWork(Work work);

    Work selectWorkById(Long id);

    List<Work> selectAllWorks();

    void updateWork(Work work);

    void deleteWorkById(Long id);
}

