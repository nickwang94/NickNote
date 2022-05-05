package com.nick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello Jenkins, This Code from github";
    }
}
