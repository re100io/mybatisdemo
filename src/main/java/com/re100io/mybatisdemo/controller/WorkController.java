package com.re100io.mybatisdemo.controller;

import com.re100io.mybatisdemo.model.Work;
import com.re100io.mybatisdemo.mapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/works")
public class WorkController {

    private final WorkMapper workMapper;

    @Autowired
    public WorkController(WorkMapper workMapper) {
        this.workMapper = workMapper;
    }

    @PostMapping
    public void addWork(@RequestBody Work work) {
        workMapper.insertWork(work);
    }

    @GetMapping("/{id}")
    public Work getWork(@PathVariable Long id) {
        return workMapper.selectWorkById(id);
    }

    @GetMapping
    public List<Work> getAllWorks() {
        return workMapper.selectAllWorks();
    }

    @PutMapping("/{id}")
    public void updateWork(@PathVariable Long id, @RequestBody Work work) {
        work.setId(id);
        workMapper.updateWork(work);
    }

    @DeleteMapping("/{id}")
    public void deleteWork(@PathVariable Long id) {
        workMapper.deleteWorkById(id);
    }
}

