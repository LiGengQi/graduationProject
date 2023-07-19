package com.ligq.graduate.mapper;

import com.ligq.graduate.pojo.UserInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/4/7 14:10
 */
@Mapper
@Repository
public interface UserInformationMapper {
    List<UserInformation> queryUserInfoList();

    int pushUserInfo(UserInformation userInformation);

    int pushInfoImage(@Param("infoId")int id,@Param("imgUrl")String url);

    int deleteUserInfo(@Param("info_id")int id);
}
