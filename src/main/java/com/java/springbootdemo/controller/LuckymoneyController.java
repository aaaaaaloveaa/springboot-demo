//package com.java.springbootdemo.controller;
//
//import com.java.springbootdemo.model.Luckymoney;
//import com.java.springbootdemo.repository.LuckymoneyRepository;
//import com.java.springbootdemo.service.LuckymoneyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.math.BigDecimal;
//import java.util.List;
//
///**
// * @author lch
// * @create 2020-03-08 13:55
// */
//@RestController
//public class LuckymoneyController {
//
//
//    @Autowired
//    private LuckymoneyRepository luckymoneyRepository;
//
//    @Autowired
//    private LuckymoneyService service;
//
//    /**
//     * restful风格完成红包的增删该查操作
//     */
//
//    // 保存
//    @PostMapping("/save")
//    public Luckymoney save() {
//        Luckymoney luckymoney = new Luckymoney();
//        luckymoney.setMoney(new BigDecimal("0.01"));
//        luckymoney.setProducer("aaa");
//        luckymoney.setConsumer("bbb");
//        return luckymoneyRepository.save(luckymoney);
//    }
//
//    // 查询全部
//    @GetMapping("/list")
//    public List<Luckymoney> list() {
//        return luckymoneyRepository.findAll();
//    }
//
//    // 修改
//    @PutMapping("/update")
//    public Luckymoney update(@RequestParam("id") Integer id) {
//        Luckymoney luckymoney = new Luckymoney();
//        Luckymoney luckymoney1 = luckymoneyRepository.getOne(id);
//        return luckymoneyRepository.save(luckymoney1);
//    }
//
//    // 删除
//    @DeleteMapping("/delete")
//    public void delete(@RequestParam("id")Integer id) {
//        luckymoneyRepository.deleteById(id);
//    }
//
//
//    @PostMapping("/two")
//    public String createTwo() {
//        service.createTwo();
//        return "success";
//    }
//}
