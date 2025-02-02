package com.re100io.mybatisdemo.mapper;

import com.re100io.mybatisdemo.model.Writer;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WriterMapper {
    void insertWriter(Writer writer);

    Writer selectWriterById(Long id);

    List<Writer> selectAllWriters();

    void updateWriter(Writer writer);

    void deleteWriterById(Long id);
}

