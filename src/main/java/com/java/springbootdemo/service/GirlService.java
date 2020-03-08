package com.java.springbootdemo.service;

import com.java.springbootdemo.exception.GirlException;
import org.springframework.stereotype.Service;

/**
 * @author lch
 * @create 2020-03-08 20:11
 */
@Service
public class GirlService {


    /**
     * 根据年龄返回不同的信息
     */
    public void judgeAge(Integer id) throws Exception {

        if (id < 12) {
            throw new GirlException(100,"小于12");
        }else if(id >= 12 && id < 16) {
            throw new GirlException(101,"上高中");
        }

        System.out.println("后续逻辑");
    }
}
