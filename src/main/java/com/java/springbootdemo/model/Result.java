package com.java.springbootdemo.model;

import lombok.Data;

/**
 * @author lch
 * @create 2020-03-08 18:41
 */
@Data
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;
}
