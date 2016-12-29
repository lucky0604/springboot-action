package com.lucky.ch01.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 12/29/16.
 */
public class RunApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
