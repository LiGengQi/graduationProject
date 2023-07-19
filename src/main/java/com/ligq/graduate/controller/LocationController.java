package com.ligq.graduate.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/5/5 18:49
 */
@RestController
public class LocationController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/student/updataLocation")
    public String updataLocation(@RequestParam("latitude")String latitude,
                                 @RequestParam("longitude")String longitude){
        ArrayList<String> list = new ArrayList<>();
        list.add(latitude);
        list.add(longitude);
        redisTemplate.boundListOps("location").rightPush(list);
        return "OK";
    }
}
