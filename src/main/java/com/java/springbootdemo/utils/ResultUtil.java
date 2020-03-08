package com.java.springbootdemo.utils;

import com.java.springbootdemo.model.Result;

/**
 * 返回结果工具类
 * @author lch
 * @create 2020-03-08 18:52
 */
public class ResultUtil {

    /**
     * 有参成功返回
     * @param object
     * @return
     */
    public static Result success(Object object) {
        Result<Object> result = new Result<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    /**
     * 无参成功返回
     * @return
     */
    public static Result success() {
        return success(null);
    }

    /**
     * 失败返回
     * @param code
     * @param message
     * @return
     */
    public static Result error(Integer code,String message) {
        Result<Object> result = new Result<>();
        result.setCode(code);
        result.setMsg(message);
        return result;
    }
}
