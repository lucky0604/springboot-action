package com.lucky.ch03.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 12/30/16.
 */
public class RunApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i ++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
