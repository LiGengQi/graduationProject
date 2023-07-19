package com.ligq.graduate.implement;

import com.github.pagehelper.PageInfo;
import com.ligq.graduate.mapper.DishCommentMapper;
import com.ligq.graduate.pojo.CommentResources;
import com.ligq.graduate.pojo.DishComment;
import com.ligq.graduate.services.DishCommentServicesI;
import com.ligq.graduate.util.PaginationUtil;
import com.ligq.graduate.util.ProgramID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @author LiGengqi
 * @date 2023/3/29 14:31
 */
@Service
public class DishCommentServicesImpl implements DishCommentServicesI {

    @Autowired
    DishCommentMapper dishCommentMapper;
    @Override
    public List<DishComment> queryCommentList(String dishNo) {
        PaginationUtil.paginationMethod(dishCommentMapper.queryCommentList(dishNo),1,5);
        return dishCommentMapper.queryCommentList(dishNo);
    }

    @Override
    public int pushComment(MultipartFile file, DishComment dishComment) {
        String type = file.getContentType().split("/")[1];
        String uri = "commentImage/" + UUID.randomUUID().toString() + "." + type;
        String url = ProgramID.url + uri;
        File file1 = new File(ProgramID.uri + uri);
        try {
            file.transferTo(file1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(dishComment);
        dishCommentMapper.pushComment(dishComment);
        CommentResources commentResources = new CommentResources(dishComment.getSkuId(), url,"image","null");
        dishCommentMapper.pushCommentImage(commentResources);
        return 0;
    }


    public PageInfo<DishComment> queryCommentList(String dishNo, int pageIndex, int pageSize) {
        return PaginationUtil.paginationMethod(queryCommentList(dishNo),pageIndex,pageSize);
    }
}
