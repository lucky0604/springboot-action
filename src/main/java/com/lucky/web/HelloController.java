package com.lucky.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lucky on 17-1-2.
 */
// 利用@Controller声明是一个控制器
@Controller
public class HelloController extends WebMvcConfigurerAdapter {
    // 利用@RequestMapping配置URL和方法之间的映射
    /*
    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
    */
    //-----------------------------------------
    // 通过重写addViewControllers来简化配置
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("/index");
        // 上传文件页
        registry.addViewController("/toUpload").setViewName("/upload");
        // 配置MessageConverter路由
        registry.addViewController("/converter").setViewName("/converter");
    }
}
