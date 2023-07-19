package com.ligq.graduate.controller;

import com.github.pagehelper.PageInfo;
import com.ligq.graduate.implement.DishCommentServicesImpl;
import com.ligq.graduate.implement.DishesServicesImpl;
import com.ligq.graduate.pojo.DishComment;
import com.ligq.graduate.pojo.Dishes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LiGengqi
 * @date 2023/5/22 22:14
 */
@RestController
public class DishController {
    @Autowired
    DishCommentServicesImpl commentServices;

    @Autowired
    DishesServicesImpl dishesServices;

    /**
     * 评论
     * @param pageIndex
     * @param pageSize
     * @param dishNo
     * @return
     */
    @RequestMapping("/getDishCommentList")
    public Map getDishCommentList(
            @RequestParam("pageIndex")int pageIndex,
            @RequestParam("pageSize") int pageSize,
            @RequestParam("dishNo")String dishNo){
        PageInfo pageInfo = commentServices.queryCommentList(dishNo,pageIndex,pageSize);
        Map map = new HashMap<>();
        map.put("totalCount", pageInfo.getSize());
        map.put("pageList", pageInfo.getList());
        return map;
    }

    @RequestMapping("/uploadComment")
    public int uploadCommnet(
            @RequestParam("commentImage") MultipartFile commentImage,
            DishComment dishComment){

        commentServices.pushComment(commentImage, dishComment);

        return 0;
    }

    @RequestMapping("/getOwnDishes")
    public List<Dishes> getOwnDish(@RequestParam("openId") String  openId){
        return dishesServices.getOwnDishes(openId);
    }
}
