package com.re100io.mybatisdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FileUploadController {
    private static final String UPLOAD_DIR = "/tmp/upload/";

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                // 获取文件名
                String filename = file.getOriginalFilename();
                // 定义文件保存的路径
                String path = "/tmp/upload/" + filename;
                // 保存文件
                file.transferTo(new File(path));
                return "文件上传成功: " + filename;
            } catch (Exception e) {
                return "文件上传失败: " + e.getMessage();
            }
        } else {
            return "上传的文件为空";
        }
    }

    @GetMapping("/files")
    public List<String> listUploadedFiles() {
        File folder = new File(UPLOAD_DIR);
        File[] listOfFiles = folder.listFiles();
        List<String> fileNames = new ArrayList<>();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    fileNames.add(file.getName());
                }
            }
        }
        return fileNames;
    }
}
