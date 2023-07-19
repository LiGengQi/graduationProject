package com.ligq.graduate.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author LiGengqi
 * @date 2023/3/14 21:45
 * @title 学生
 */
@Getter
@Setter
public class Student extends User {
    /** 经度 */
    private String longitude;
    /** 纬度 */
    private String latitude;
    /** 年级 */
    private String grade;

    /**
     * 上传当前位置
     * @return
     */
    public String UploadLocation(){
        return "";
    }



}
