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
        return "hello dj hahaha";
    }
}
