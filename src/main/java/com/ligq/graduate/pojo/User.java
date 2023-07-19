package com.ligq.graduate.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.PrintConversionEvent;

/**
 * @author LiGengqi
 * @date 2023/3/14 21:28
 */
@Getter
@Setter
public class User {
    private String openId;
    private String sessionKey;
    private String userName;
    private String userImg;
    private String userKind;

    /**
     * 用户登录
     * @return
     */
    public String UserLogin(){
        return "";
    }

    /**
     * 用户注销
     * @return
     */
    public String UserLogout(){
        return "";
    }

}
