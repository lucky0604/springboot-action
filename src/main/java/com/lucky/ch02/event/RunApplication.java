package com.lucky.ch02.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 12/30/16.
 */
public class RunApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        CustomEventPublisher customEventPublisher = context.getBean(CustomEventPublisher.class);
        customEventPublisher.publish("hello application event");
        context.close();
    }
}
