package com.ligq.graduate.implement;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ligq.graduate.mapper.DishesMapper;
import com.ligq.graduate.pojo.Dishes;
import com.ligq.graduate.services.DishesServicesI;
import com.ligq.graduate.util.PaginationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/3/22 17:12
 */
@Service
public class DishesServicesImpl implements DishesServicesI {

    @Autowired
    DishesMapper dishesMapper;
    List<Dishes> dishes;

    @Override
    public List<Dishes> queryDishesList(int dishNo) {
        dishes = dishesMapper.queryDishesList(1);
        return dishes;
    }

    @Override
    public List<Dishes> searchDishList(String dishKey) {
        return dishesMapper.searchDishLish(dishKey);
    }

    public PageInfo<Dishes> getOrderInfoList(int pageIndex, int storeId, int pageSize, int dishNo){
        List<Dishes> list = dishesMapper.queryDishesList(dishNo);
        return PaginationUtil.paginationMethod(list,pageIndex,6);
    }

    public List<Dishes> getOwnDishes(String openId){

        return dishesMapper.searchOwnDish(openId);
    }


}
