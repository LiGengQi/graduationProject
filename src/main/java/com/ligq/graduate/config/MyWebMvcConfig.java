package com.ligq.graduate.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author LiGengqi
 * @date 2023/4/7 13:25
 */

@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    private String filePath = "E:\\ahh";
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/view/**").addResourceLocations("file:E:\\ahh\\");
    }
}