package com.itdachang.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihuaiqiang
 * @description
 * @date 2021/4/20 18:37
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello DevOps !!!";
    }
}
