package com.ligq.graduate.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author LiGengqi
 * @date 2023/3/14 21:10
 */
@Getter
@Setter
public class RealTimelocation {
    /** 经度 */
    private String longitude;
    /** 纬度 */
    private String latitude;
    /** 实时数量 */
    private int realTimeNumber;

    RealTimelocation(){

    }

    /**
     * 数据初始化
     * @param longitude
     * @param latitude
     * @param realTimeNumber
     */
    RealTimelocation(String longitude, String latitude, int realTimeNumber){
        this.longitude = longitude;
        this.latitude = latitude;
        this.realTimeNumber = realTimeNumber;
    }
}
