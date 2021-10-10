//package com.java.springbootdemo.controller;
//
//import com.java.springbootdemo.model.Girl;
//import com.java.springbootdemo.model.Result;
//import com.java.springbootdemo.service.GirlService;
//import com.java.springbootdemo.utils.ResultUtil;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
///**
// * @author lch
// * @create 2020-03-08 16:49
// */
//@RestController
//@RequestMapping("/girl")
//public class GirlController {
//
//    public static final Logger log = LoggerFactory.getLogger(GirlController.class);
//
//    @Autowired
//    private GirlService girlService;
//
//    @PostMapping("/add")
//    public String add(@RequestParam("age") Integer age,
//                      @RequestParam("cupSize") String cupSize) {
//        return "年龄:"+age+"   "+"cupSize:"+cupSize;
//    }
//
//
//    @PostMapping("/add1")
//    public Result<Girl> add1(@RequestBody @Valid Girl girl, BindingResult bindingResult) {
//
//        log.info("进入方法");
//        if (bindingResult.hasErrors()) {
//            String message = bindingResult.getFieldError().getDefaultMessage();
//            return ResultUtil.error(1,message);
//        }
//        return ResultUtil.success(girl);
//    }
//
//    @GetMapping("/judgeAge")
//    public void judgeAge(@RequestParam("id") Integer id) throws Exception {
//        girlService.judgeAge(id);
//    }
//
//}
