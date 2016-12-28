package com.lucky.ch01.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 16-12-29.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigService.class);
        FunctionServiceImpl functionServiceImpl = context.getBean(FunctionServiceImpl.class);
        System.out.println(functionServiceImpl.SayHello("di"));
        context.close();
    }
}
