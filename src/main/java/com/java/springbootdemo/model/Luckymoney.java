package com.java.springbootdemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author lch
 * @create 2020-03-08 13:45
 */
@Data
@NoArgsConstructor
@Entity
public class Luckymoney {

    @Id
    @GeneratedValue
    private Integer id;

    private BigDecimal money;

    /** 发送方. */
    private String producer;

    /** 接收方. */
    private String consumer;

}
