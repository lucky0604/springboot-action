package com.lucky.ch02.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 16-12-29.
 */
public class RunApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}
