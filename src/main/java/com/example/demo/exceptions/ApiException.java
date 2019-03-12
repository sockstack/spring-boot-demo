package com.example.demo.exceptions;

import java.lang.Exception;
public class ApiException extends Exception {
    public ApiException(String message) {
        super(message);
    }
}
