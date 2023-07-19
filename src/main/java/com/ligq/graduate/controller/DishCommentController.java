package com.ligq.graduate.controller;

import com.github.pagehelper.PageInfo;
import com.ligq.graduate.implement.DishCommentServicesImpl;
import com.ligq.graduate.pojo.DishComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiGengqi
 * @date 2023/5/18 15:00
 */
@RestController
public class DishCommentController {

//    @Autowired
//    DishCommentServicesImpl commentServices;
//
//    /**
//     * 评论
//     * @param pageIndex
//     * @param pageSize
//     * @param dishNo
//     * @return
//     */
//    @RequestMapping("/getDishCommentList")
//    public Map getDishCommentList(
//            @RequestParam("pageIndex")int pageIndex,
//            @RequestParam("pageSize") int pageSize,
//            @RequestParam("dishNo")String dishNo){
//        PageInfo pageInfo = commentServices.queryCommentList(dishNo,pageIndex,pageSize);
//        Map map = new HashMap<>();
//        map.put("totalCount", pageInfo.getSize());
//        map.put("pageList", pageInfo.getList());
//        return map;
//    }
//
//    @RequestMapping("/uploadComment")
//    public int uploadCommnet(
//            @RequestParam("commentImage")MultipartFile commentImage,
//            DishComment dishComment){
//
//        commentServices.pushComment(commentImage, dishComment);
//
//        return 0;
//    }

}
