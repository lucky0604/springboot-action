package com.lucky.ch03.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 12/30/16.
 *
 * 基于条件的Bean的创建，即使用@Conditional注解
 * @Conditional根据满足某一个特定条件创建一个特定的Bean
 */
public class RunApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为： " + listService.showListCmd());
    }
}