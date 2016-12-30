package com.lucky.ch03.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by lucky on 12/30/16.
 */
@Configuration
@ComponentScan("com.lucky.ch03.taskscheduler")
// 通过@EnableScheduling注解开启对计划任务的支持
@EnableScheduling
public class TaskSchedulerConfig {
}
