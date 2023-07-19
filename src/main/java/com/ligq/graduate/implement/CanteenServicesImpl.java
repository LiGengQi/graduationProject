package com.ligq.graduate.implement;

import com.ligq.graduate.mapper.CanteenMapper;
import com.ligq.graduate.pojo.Canteen;
import com.ligq.graduate.pojo.CanteenManager;
import com.ligq.graduate.services.CanteenServicesI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiGengqi
 * @date 2023/3/21 11:19
 */
@Service
public class CanteenServicesImpl implements CanteenServicesI {

    @Autowired
    CanteenMapper canteenMapper;

    @Override
    public List<Canteen> queryCateen() {
        return canteenMapper.queryCateen();
    }
}
