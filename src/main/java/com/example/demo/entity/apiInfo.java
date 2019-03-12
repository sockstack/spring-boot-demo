package com.example.demo.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;


@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class apiInfo<T> {
    private Integer code;
    private String msg;
    private T data;

    public apiInfo() {
    }

    public apiInfo(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
