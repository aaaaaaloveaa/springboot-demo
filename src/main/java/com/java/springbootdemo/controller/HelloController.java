package com.java.springbootdemo.controller;

import com.java.springbootdemo.config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;

/**
 * @author lch
 * @create 2020-03-01 23:58
 */
@RestController
public class HelloController {

    @Value("${minMoney}")
    private BigDecimal minMoney;

    @Value("${maxMoney}")
    private BigDecimal maxMoney;

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    /**
     * value的方式读取属性配置
     * @return
     */
    @GetMapping("/test1")
    public String test1() {
        return "最少的money:"+minMoney+" 最大的money:"+maxMoney;
    }

    /**
     * 配置类的方式读取配置属性
     * @return
     */
    @GetMapping("/test2")
    public String test2() {
        return "最少的money:"+limitConfig.getMinMoney()+
                "   最大的money:"+limitConfig.getMaxMoney()+
                "   描述:"+limitConfig.getDescription();
    }

    @PostMapping("/test3")
    public String test3(@RequestParam("id") String id) {
        return "id="+id;
    }


}
