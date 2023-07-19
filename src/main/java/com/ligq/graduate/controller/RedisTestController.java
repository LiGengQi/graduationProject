package com.ligq.graduate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiGengqi
 * @date 2022/7/31 12:51
 */

@RestController
@RequestMapping("/redisTest")
public class RedisTestController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("getLocation1")
    public String testRedis(){
//        //设置值到redis
//        redisTemplate.opsForValue().set("name","lucy");
//        //获取值
//        String  name = (String) redisTemplate.opsForValue().get("name");
//
//        return name;
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        redisTemplate.boundListOps("location").rightPush(list);
        List listKey1 = redisTemplate.boundListOps("location").range(0, 2);
        System.out.println(listKey1);
        return "123";
    }
}
