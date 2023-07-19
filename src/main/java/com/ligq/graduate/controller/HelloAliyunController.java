package com.ligq.graduate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloAliyunController {

    @RequestMapping("/")
    public String getDishList(){
        return "你好啊";
    }
}