package com.java.springbootdemo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author lch
 * @create 2020-03-08 20:50
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {

    SUNCESS(0,"成功"),
    UNKNOWN_EXCEPTION(-1,"系统未知错误"),
    ;

    private Integer code;

    private String msg;
}
