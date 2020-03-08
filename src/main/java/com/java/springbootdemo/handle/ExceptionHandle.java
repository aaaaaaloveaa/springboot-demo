package com.java.springbootdemo.handle;

import com.java.springbootdemo.exception.GirlException;
import com.java.springbootdemo.model.Result;
import com.java.springbootdemo.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lch
 * @create 2020-03-08 20:18
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = GirlException.class)
    @ResponseBody
    public Result handle(Exception e) {

        if (e instanceof GirlException) {
            GirlException girlException = (GirlException)e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else {
            return ResultUtil.error(-1,"系统位置错误");
        }
    }
}
