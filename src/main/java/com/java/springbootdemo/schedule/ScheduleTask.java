package com.java.springbootdemo.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author lch
 * @create 2020-03-10 21:17
 */
@Slf4j
@Component
public class ScheduleTask {

    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter
            .ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * 上次执行开始后3秒之后执行
     */
    @Scheduled(fixedRate = 3000)
    public void schedule1() {
        log.info("定时任务1:{}",LocalDateTime.now().format(dateTimeFormatter));
    }

    /**
     * 上次执行完成后3秒执行
     */
    @Scheduled(fixedDelay = 3000)
    public void schedule2() {
        log.info("定时任务2:{}",LocalDateTime.now().format(dateTimeFormatter));
    }

    /**
     * 初始延迟2秒,后每隔3秒执行
     */
    @Scheduled(initialDelay = 2000,fixedRate = 3000)
    public void schedule3() {
        log.info("定时任务3:{}",LocalDateTime.now().format(dateTimeFormatter));
    }

    /**
     * 每隔3秒执行
     */
    @Scheduled(cron = "*/3 * * * * ?")
    public void schedule4() {
        log.info("定时任务4:{}",LocalDateTime.now().format(dateTimeFormatter));
    }

}
