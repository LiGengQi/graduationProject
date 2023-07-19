package com.ligq.graduate.services;

import com.ligq.graduate.pojo.DishComment;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/3/29 14:30
 */
public interface DishCommentServicesI {
    List<DishComment> queryCommentList(String dishNo);

    int pushComment(MultipartFile file, DishComment dishComment);


}
