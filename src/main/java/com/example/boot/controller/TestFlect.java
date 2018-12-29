package com.example.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;

/**
 * Created by wang on 2018/12/23.
 */
@RestController
public class TestFlect {
//
//    @Value(value = "${user.username}")
//    private String string;

    @RequestMapping(value = "/run")
    public void run(){
        System.out.println("你好");
        try {
            Class testMech = Class.forName("com.example.boot.entity.TestMech");
            Constructor[] arry =testMech.getDeclaredConstructors();
            for (Constructor ary : arry) {
                System.out.println("ary1");
                System.out.println("0000");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
