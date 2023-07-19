package com.ligq.graduate.services;

import com.ligq.graduate.pojo.User;

/**
 * @author LiGengqi
 * @date 2023/4/3 11:52
 */
public interface UserServicesI {
    User isExistUser(String code,String userKind);
    User userRegistration(User user);
}
