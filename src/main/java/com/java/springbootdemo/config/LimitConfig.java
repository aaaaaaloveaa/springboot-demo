package com.java.springbootdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author lch
 * @create 2020-03-08 9:56
 */
@Component
@ConfigurationProperties(prefix = "limit")
@Data
public class LimitConfig {

    private BigDecimal minMoney;

    private BigDecimal maxMoney;

    private String description;

}
