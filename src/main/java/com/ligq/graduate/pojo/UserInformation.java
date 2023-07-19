package com.ligq.graduate.pojo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/4/7 14:02
 */
@Getter
@Setter
public class UserInformation extends User {
    private int infoId;
//    private String openId;
//    private String avatarUrl;
    private String content;
    private List<String> resourceUrl;
    private Timestamp infoTime;

    public String getInfoTime() {
        return Long.toString(this.infoTime.getTime());
    }
}
