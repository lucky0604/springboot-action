package com.lucky.ch03.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by lucky on 12/30/16.
 *
 * spring通过TaskExecutor来实现多线程和并发编程
 * 使用ThreadPoolTaskExecutor来实现线程池的TaskExecutor
 * 实际开发中任务一般是非阻碍的，即异步的，所以我们要在配置类中通过@EnableAsync开启对异步任务的支持，并通过在实际执行的Bean的方法中使用@Async注解来声明其是一个异步任务
 */
@Configuration
@ComponentScan("com.lucky.ch03.taskexecutor")
// 利用@EnableAsync来开启对异步任务的支持
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {

    // 配置类实现AsyncConfigurer接口并重写getAsyncExecutor方法，并返回一个ThreadPoolTaskExecutor,以此获得一个基于线程池TaskExecutor
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }

}
