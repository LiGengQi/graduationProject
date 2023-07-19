package com.ligq.graduate.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author LiGengqi
 * @date 2023/3/15 17:29
 * @title 食堂档口
 */
@Getter
@Setter
public class CanteenStall {
    /** 档口名称 */
    private String stallName;
    /** 档口菜品 */
    private ArrayList<Dishes> dishes;
    /** 档口介绍 */
    private String stallIntroduce;

    private String latitude;
    private String longitude;
}
