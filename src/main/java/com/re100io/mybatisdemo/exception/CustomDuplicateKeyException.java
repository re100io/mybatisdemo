package com.re100io.mybatisdemo.exception;

public class CustomDuplicateKeyException extends RuntimeException {
    public CustomDuplicateKeyException(String message) {
        super(message);
    }
}
