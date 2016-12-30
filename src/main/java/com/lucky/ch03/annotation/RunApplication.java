package com.lucky.ch03.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 12/30/16.
 *
 *
 */
public class RunApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NewConfig.class);
        AnnotationService annotationService = context.getBean(AnnotationService.class);
        annotationService.outputResult();
        context.close();
    }
}
