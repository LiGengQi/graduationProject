package com.ligq.graduate.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author LiGengqi
 * @date 2023/3/16 13:43
 * 商家
 */
@Getter
@Setter
public class Business extends User {
    /** 自己的档口 */
    private CanteenStall stall;

}
