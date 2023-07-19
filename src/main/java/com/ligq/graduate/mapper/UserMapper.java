package com.ligq.graduate.mapper;

import com.ligq.graduate.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author LiGengqi
 * @date 2023/4/3 11:40
 */
@Mapper
@Repository
public interface UserMapper {
    User isExistUser(@Param("openId") String openId,@Param("userKind") String userKind);

    int userRegistration(User user);
    int uploadAvatar(@Param("openId") String openId,
                     @Param("avatarUrl") String avatarUrl,
                     @Param("userName")String userName);
}
