package com.ligq.graduate.pojo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/3/28 11:27
 * 商品评价
 */
@Getter
@Setter
public class DishComment {
    public String getCommentTime() {
        return Long.toString(commentTime.getTime());
    }
    private int dishNo;// 商品号
    private String userName;
    private int skuId; //评论号
    private String commentContent;// 评论内容
    private List<CommentResources> commentResources;// 评论带图
    private int commentScore;// 评分
    private String userNo;// 用户名
    private String userHeadUrl;// 用户头像
    private Timestamp commentTime;// 评论时间
    private String sellerReply;// 商家回复
    private String dishInfo;// 菜品信息
}
