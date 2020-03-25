package com.java.springbootdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author lch
 * @create 2020-03-11 9:20
 */
@Slf4j
@Service
public class AsyncService {

    @Async
    public void test() {
        throw new RuntimeException("运行异常");
    }

}
