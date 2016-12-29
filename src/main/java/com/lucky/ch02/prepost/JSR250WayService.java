package com.lucky.ch02.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by lucky on 16-12-29.
 */
public class JSR250WayService {
    // 在构造函数执行完之后执行
    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    // 在Bean销毁前执行
    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }
}
