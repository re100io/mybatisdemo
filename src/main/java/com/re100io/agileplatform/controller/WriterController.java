package com.re100io.agileplatform.controller;

import com.re100io.agileplatform.model.Writer;
import com.re100io.agileplatform.dao.mapper.WriterMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/writers")
public class WriterController {

    private final WriterMapper writerMapper;

    @Autowired
    public WriterController(WriterMapper writerMapper) {
        this.writerMapper = writerMapper;
    }

    @PostMapping
    public void addWriter(@RequestBody Writer writer) {
        writerMapper.insertWriter(writer);
    }

    @GetMapping("/{id}")
    public Writer getWriter(@PathVariable Long id) {
        return writerMapper.selectWriterById(id);
    }

    @GetMapping
    public List<Writer> getAllWriters() {
        log.info("getAllWriters");
        return writerMapper.selectAllWriters();
    }

    @PutMapping("/{id}")
    public void updateWriter(@PathVariable Long id, @RequestBody Writer writer) {
        writer.setId(id);
        writerMapper.updateWriter(writer);
    }

    @DeleteMapping("/{id}")
    public void deleteWriter(@PathVariable Long id) {
        writerMapper.deleteWriterById(id);
    }
}
