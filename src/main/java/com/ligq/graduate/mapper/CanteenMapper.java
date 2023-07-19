package com.ligq.graduate.mapper;

import com.ligq.graduate.pojo.Canteen;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/3/21 11:15
 */
@Mapper
@Repository
public interface CanteenMapper {

    /** 获取食堂列表 */
    List<Canteen> queryCateen();
}
