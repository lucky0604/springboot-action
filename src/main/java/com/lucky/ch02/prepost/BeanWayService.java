package com.lucky.ch02.prepost;

/**
 * Created by lucky on 16-12-29.
 *
 * Spring对Bean的生命周期的操作提供了支持，在使用Java配置和注解配置下提供两种方式
 * 1> Java的配置方式，使用@Bean的initMethod和destroyMethod（相当于xml配置的init-method和destroy-method
 * 2> 注解方式：利用JSR250的@PostConstruct和@PreDestroy
 */
public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
