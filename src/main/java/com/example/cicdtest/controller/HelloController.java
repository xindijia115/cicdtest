package com.example.cicdtest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xia
 * @date: 2024-08-16  16:04
 * @description:
 */

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        String hello = "终于可以了啊 我的天";
        int a = 1;
        int b = 2;
        int sum = a + b;
        String c = "你怎么还不出来";
        return hello + sum + c;
    }
}
