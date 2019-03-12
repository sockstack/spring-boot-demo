package com.example.demo.enums;

public enum StatusCode {
    SUCCESS(200, "success"),
    FAIL(404, "fail");

    private Integer code;
    private String value;

    StatusCode(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
