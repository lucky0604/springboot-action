package com.lucky.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lucky on 17-1-2.
 */
// 利用@Controller声明是一个控制器
@Controller
public class HelloController {
    // 利用@RequestMapping配置URL和方法之间的映射
    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
