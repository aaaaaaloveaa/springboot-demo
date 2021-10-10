//package com.java.springbootdemo.service;
//
//import com.java.springbootdemo.model.Luckymoney;
//import com.java.springbootdemo.repository.LuckymoneyRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.math.BigDecimal;
//
///**
// * @author lch
// * @create 2020-03-08 16:16
// */
//@Service
//public class LuckymoneyService {
//
//    @Autowired
//    private LuckymoneyRepository luckymoneyRepository;
//
//    @Transactional
//    public void createTwo() {
//
//        Luckymoney luckymoney1 = new Luckymoney();
//        luckymoney1.setProducer("师兄");
//        luckymoney1.setMoney(new BigDecimal("520"));
//        luckymoneyRepository.save(luckymoney1);
//
//
//        Luckymoney luckymoney2 = new Luckymoney();
//        luckymoney2.setProducer("师兄");
//        luckymoney2.setMoney(new BigDecimal("100"));
//        luckymoneyRepository.save(luckymoney2);
//    }
//
//}
