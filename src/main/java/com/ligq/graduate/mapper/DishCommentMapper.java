package com.ligq.graduate.mapper;

import com.ligq.graduate.pojo.CommentResources;
import com.ligq.graduate.pojo.DishComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/3/28 14:03
 */
@Mapper
@Repository
public interface DishCommentMapper {
    List<DishComment> queryCommentList(@Param("dishNo") String dishNo);

    int pushComment(DishComment dishComment);
    int pushCommentImage(CommentResources commentResources);
}
