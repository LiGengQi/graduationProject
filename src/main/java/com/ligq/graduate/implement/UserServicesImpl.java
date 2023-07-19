package com.ligq.graduate.implement;

import com.ligq.graduate.mapper.UserMapper;
import com.ligq.graduate.pojo.User;
import com.ligq.graduate.services.UserServicesI;
import com.ligq.graduate.util.ProgramID;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author LiGengqi
 * @date 2023/4/3 11:53
 */
@Service
public class UserServicesImpl implements UserServicesI {

    @Autowired
    UserMapper userMapper;

    @Override
    public User isExistUser(String code, String userKind) {
        User user = userMapper.isExistUser(code, userKind);
        if(user == null)
            return null;
        return user;
    }

    public User getUser(String code,String userKind,String sessionKey){
        User result = userMapper.isExistUser(code, userKind);
        if (result == null){
            User user = new User();
            user.setOpenId(code);
            user.setSessionKey(sessionKey);
            return user;
        }
        return result;
    }
    public User uploadAvatar(User user, MultipartFile file){

        String type = file.getContentType().split("/")[1];
        String uri = "avatar/" + UUID.randomUUID().toString() + "." + type;
        String url = ProgramID.url + uri;
        File file1 = new File(ProgramID.uri + uri);
        try {
            file.transferTo(file1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        user.setUserImg(url);
        userMapper.userRegistration(user);
        return userMapper.isExistUser(user.getOpenId(), user.getUserKind());
    }

    @Override
    public User userRegistration(User user) {

        return isExistUser(user.getOpenId(),user.getUserKind());
    }
}
