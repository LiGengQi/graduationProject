package com.ligq.graduate.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author LiGengqi
 * @date 2023/3/14 21:49
 * @title 食堂
 */
@Getter
@Setter
public class Canteen {
    private String canteenLogo;
    private String canteenName;
    private String canteenIndex;
    private String canteenManagerNo;
    private ArrayList<Dishes> dishes;

    @Override
    public String toString() {
        return "Canteen{" +
                "canteenLogo='" + canteenLogo + '\'' +
                ", canteenName='" + canteenName + '\'' +
                ", canteenIndex='" + canteenIndex + '\'' +
                ", canteenManagerNo='" + canteenManagerNo + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
