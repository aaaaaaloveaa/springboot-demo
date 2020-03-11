package com.java.springbootdemo.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author lch
 * @create 2020-03-10 22:03
 */
@Slf4j
@Service  // component也行
public class AsyncTask {

    @Async
    public void task1() throws InterruptedException {
        log.info("线程:{}",Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(2);
    }

    @Async
    public Future<Integer> task2() throws InterruptedException {
        log.info("线程:{}",Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(2);
        return new AsyncResult<>(100);
    }
}
