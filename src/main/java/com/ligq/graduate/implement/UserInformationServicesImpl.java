package com.ligq.graduate.implement;

import com.ligq.graduate.mapper.UserInformationMapper;
import com.ligq.graduate.pojo.UserInformation;
import com.ligq.graduate.services.UserInformationServicesI;
import com.ligq.graduate.util.ProgramID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

/**
 * @author LiGengqi
 * @date 2023/4/7 14:39
 */
@Service
public class UserInformationServicesImpl implements UserInformationServicesI {

    @Autowired
    UserInformationMapper userInformationMapper;
    @Override
    public List<UserInformation> queryUserInfoList() {
        return userInformationMapper.queryUserInfoList();
    }

    @Override
    public int pushUserInfo(UserInformation userInformation, MultipartFile file) {
        String type = file.getContentType().split("/")[1];
        String uri = "commentImage/" + UUID.randomUUID().toString() + "." + type;
        String url = ProgramID.url + uri;
//        String url = ProgramID.url + UUID.randomUUID().toString() + "." + type;
        File file1 = new File(ProgramID.uri + uri);
        try {
            file.transferTo(file1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        userInformationMapper.pushUserInfo(userInformation);
        userInformationMapper.pushInfoImage(userInformation.getInfoId(), url);
        return 1;
    }

    @Override
    public int deleteUserInfo(int infoId) {
        return userInformationMapper.deleteUserInfo(infoId);
    }
}
