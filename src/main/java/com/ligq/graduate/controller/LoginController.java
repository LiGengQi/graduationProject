package com.ligq.graduate.controller;

import com.alibaba.fastjson.JSONObject;
import com.ligq.graduate.implement.UserServicesImpl;
import com.ligq.graduate.pojo.User;
import com.ligq.graduate.util.WechatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.Console;

/**
 * @author LiGengqi
 * @date 2023/4/8 12:58
 */
@RestController
public class LoginController {
    @Autowired
    UserServicesImpl userServices;
    @RequestMapping("/login")
    public User helloAliyun(@RequestParam("code")String st,
                            @RequestParam("userKind")String userKind){
        JSONObject SessionKeyOpenId = WechatUtil.getSessionKeyOrOpenId(st);
        // 3.接收微信接口服务 获取返回的参数
        String openid = SessionKeyOpenId.getString("openid");
        String sessionKey = SessionKeyOpenId.getString("session_key");
        return userServices.getUser(openid,userKind,sessionKey);
    }


    @RequestMapping("/register")
    public User userRegister(@RequestParam("code")String st,
                             User user,
                             @RequestParam("sessionKey")String sessionKey,
                             @RequestParam("file") MultipartFile file){
        JSONObject SessionKeyOpenId = WechatUtil.getSessionKeyOrOpenId(st);
        // 3.接收微信接口服务 获取返回的参数
        user.setOpenId(st);
        user.setSessionKey(sessionKey);
        return userServices.uploadAvatar(user, file);
    }

//    @RequestMapping("/uploadAvatar")
//    public int uploadAvatar(@RequestParam("code")String code,
//                            @RequestParam("userName") String userName,
//                            MultipartFile file){
//        JSONObject SessionKeyOpenId = WechatUtil.getSessionKeyOrOpenId(code);
//        // 3.接收微信接口服务 获取返回的参数
//        String openid = SessionKeyOpenId.getString("openid");
//        return userServices.uploadAvatar(openid,userName,file);
//    }
}
