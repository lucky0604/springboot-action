package com.lucky.ch02.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 12/30/16.
 */
public class RunApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}