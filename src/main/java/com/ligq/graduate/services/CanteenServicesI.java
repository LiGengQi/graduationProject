package com.ligq.graduate.services;

import com.ligq.graduate.pojo.Canteen;

import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/3/21 11:18
 */
public interface CanteenServicesI {

    /** 获取食堂列表 */
    List<Canteen> queryCateen();
}
