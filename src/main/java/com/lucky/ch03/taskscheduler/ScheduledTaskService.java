package com.lucky.ch03.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lucky on 12/30/16.
 *
 * 通过在配置类注解@EnableScheduling来开启对计划任务的支持，然后在要执行计划任务的方法上注解@Schedule，声明这是一个计划任务
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    // 通过@Scheduled声明该方法是计划任务，使用fixRate属性每隔固定时间执行
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次 " + dateFormat.format(new Date()));
    }

    // 使用cron属性可按照指定时间执行
    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
    }
}
