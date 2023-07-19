package com.ligq.graduate.mapper;

import com.ligq.graduate.pojo.Dishes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author LiGengqi
 * @date 2023/3/22 16:32
 */
@Mapper
@Repository
public interface DishesMapper {
    List<Dishes> queryDishesList(@Param("dishNo")int dishNo);

    List<Dishes> searchDishLish(@Param("dishKey")String dishKey);

    List<Dishes> searchOwnDish(@Param("openId")String openId);

}
