package com.ligq.graduate.controller;

import com.github.pagehelper.PageInfo;
import com.ligq.graduate.implement.CanteenServicesImpl;
import com.ligq.graduate.implement.DishCommentServicesImpl;
import com.ligq.graduate.implement.DishesServicesImpl;
import com.ligq.graduate.pojo.Canteen;
import com.ligq.graduate.pojo.Dishes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LiGengqi
 * @date 2023/4/8 12:59
 */
@RestController
public class HomePageController {
    @Autowired
    CanteenServicesImpl canteenServices;
    @Autowired
    DishesServicesImpl dishesServices;
    /**
     * 类别
     * @return
     */
    @RequestMapping("/getCanteenList")
    public List<Canteen> getCanteenList(){
        List<Canteen> list = new ArrayList<Canteen>();
        Canteen a = new Canteen();
        a.setCanteenIndex("0");
        a.setCanteenName("精品推荐");
        list.add(a);
        list.addAll(canteenServices.queryCateen());
        return list;
    }
    @RequestMapping("/getDishList")
    public List<Dishes> getDishList(){
        return dishesServices.queryDishesList(1);
    }

    /**
     * 商品列表
     * @param pageIndex
     * @param storeId
     * @param dishNo
     * @return
     */
    @RequestMapping("/getDishList1")
    public List<Dishes> getDishList1(
            @RequestParam("pageIndex") int pageIndex,
            @RequestParam("storeId") int storeId,
            @RequestParam("dishNo")int dishNo){
        System.out.println(dishesServices.getOrderInfoList(pageIndex,storeId,6,dishNo).getList());
        return dishesServices.getOrderInfoList(pageIndex,storeId,6,dishNo).getList();
    }

    /**
     * 商品列表 search
     * @param dishKey
     * @return
     */
    @RequestMapping("/searchDishList")
    public List<Dishes> searchDishList(
            @RequestParam("dishKey")String dishKey){
        return dishesServices.searchDishList(dishKey);
    }


}
