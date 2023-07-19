package com.ligq.graduate.util;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.ligq.graduate.pojo.Dishes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/3/25 13:30
 * 包含List分页方法
 */
public class PaginationUtil {
    public static PageInfo paginationMethod(List list, int pageIndex, int pageSize) {
        Page page = new Page(pageIndex, 6);
        int total = list.size();
        page.setTotal(total);
        int startIndex = (pageIndex - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize,total);
        if(startIndex>endIndex){
            page.addAll(new ArrayList());
            PageInfo pageInfo = new PageInfo<>(page);
            return pageInfo;
        }else{
            page.addAll(list.subList(startIndex,endIndex));
            PageInfo pageInfo = new PageInfo<>(page);
            return pageInfo;
        }


//        PageHelper.startPage(pageNum,6);
//        List<Dishes> orderInfoList = dishesMapper.queryDishesList();
//        PageInfo<Dishes> userPageInfo = new PageInfo<>(orderInfoList);
//        return userPageInfo;
    }
}
