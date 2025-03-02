package com.re100io.agileplatform.controller;

import com.re100io.agileplatform.exception.CustomDuplicateKeyException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataIntegrityViolationException(DataIntegrityViolationException e) {
        // 检查异常是否由唯一约束违反引起
        if (e.getCause() instanceof CustomDuplicateKeyException) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("违反唯一约束：尝试插入或更新已存在的值");
        }
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("数据库错误");
    }
}