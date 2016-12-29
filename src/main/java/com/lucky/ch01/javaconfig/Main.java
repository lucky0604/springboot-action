package com.lucky.ch01.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 12/29/16.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigService.class);

        // getBean需要在配置类中使用@Bean注解
        FunctionServiceImpl functionServiceImpl = context.getBean(FunctionServiceImpl.class);

        System.out.println(functionServiceImpl.SayHello("java config"));
        context.close();
    }
}
