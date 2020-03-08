package com.java.springbootdemo.exception;

import lombok.Data;

/**
 * @author lch
 * @create 2020-03-08 20:35
 */
@Data
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(Integer code,String message) {
        super(message);
        this.code = code;
    }
}
