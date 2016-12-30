package com.lucky.ch03.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 12/30/16.
 */
public class RunApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);

    }
}
