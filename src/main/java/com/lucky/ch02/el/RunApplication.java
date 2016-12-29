package com.lucky.ch02.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 16-12-29.
 */
public class RunApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();
        context.close();
    }
}
