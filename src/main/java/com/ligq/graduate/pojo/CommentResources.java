package com.ligq.graduate.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author LiGengqi
 * @date 2023/3/29 13:37
 */
@Getter
@Setter
public class CommentResources {
    private int commentNo;
    private String src;
    private String type;
    private String coverSrc;

    public CommentResources(int commentNo, String src, String type, String coverSrc) {
        this.commentNo = commentNo;
        this.src = src;
        this.type = type;
        this.coverSrc = coverSrc;
    }

    public CommentResources(){

    }
}
