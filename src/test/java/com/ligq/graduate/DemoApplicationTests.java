package com.ligq.graduate;

import com.ligq.graduate.implement.CanteenServicesImpl;
import com.ligq.graduate.pojo.Canteen;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    CanteenServicesImpl canteenServices;
    @Test
    void contextLoads() {
        for (Canteen ca :
                canteenServices.queryCateen()) {
            System.out.println(ca.toString());
        }
    }

}
