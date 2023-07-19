package com.ligq.graduate.controller;

import com.ligq.graduate.implement.UserInformationServicesImpl;
import com.ligq.graduate.pojo.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/4/7 14:51
 * 资讯控制器
 */
@RestController
public class InformationController {

    @Autowired
    UserInformationServicesImpl userInformationServices;
    @GetMapping("/getInfoList")
    public List<UserInformation> getInfoList(){
        return userInformationServices.queryUserInfoList();
    }

    @RequestMapping("/pushUserInfo")
    public String pushUserInfo(@RequestParam("file") MultipartFile st,UserInformation userInformation) throws IOException {
        userInformationServices.pushUserInfo(userInformation,st);
        return "OK";
    }

    @RequestMapping("/deleteUserInfo")
    public String deleteUserInfo(@RequestParam("infoId")int infoId) throws IOException {
        userInformationServices.deleteUserInfo(infoId);
        return "OK";
    }
}
