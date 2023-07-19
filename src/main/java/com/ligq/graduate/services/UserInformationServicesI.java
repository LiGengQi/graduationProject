package com.ligq.graduate.services;

import com.ligq.graduate.pojo.UserInformation;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/4/7 14:39
 */
public interface UserInformationServicesI {
    List<UserInformation> queryUserInfoList();

    int pushUserInfo(UserInformation userInformation, MultipartFile file);

    int deleteUserInfo(int infoId);

}
