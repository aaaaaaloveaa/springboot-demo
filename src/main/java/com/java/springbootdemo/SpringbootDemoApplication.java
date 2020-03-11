package com.java.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync // 异步支持
public class SpringbootDemoApplication {

    /**
     * 启动三种方式:
     *
     */

    public static void main(String[] args) {
         SpringApplication.run(SpringbootDemoApplication.class, args);

//        SpringApplication springApplication = new SpringApplication(SpringbootDemoApplication.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);

//        new SpringApplicationBuilder(SpringbootDemoApplication.class)
//                .bannerMode(Banner.Mode.OFF)
//                .run(args);

    }

}
