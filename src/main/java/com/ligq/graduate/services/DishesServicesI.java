package com.ligq.graduate.services;

import com.ligq.graduate.pojo.Dishes;

import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/3/22 17:12
 */
public interface DishesServicesI {
    List<Dishes> queryDishesList(int dishNo);
    List<Dishes> searchDishList(String dishKey);

}
