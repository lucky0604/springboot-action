package com.lucky.ch03.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lucky on 12/30/16.
 */
@Configuration
@ComponentScan("com.lucky.ch03.conditional")
public class ConditionConfig {

    // 通过@Conditional注解，符合Windows条件则实例化windowsListService
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }


    // 通过@Conditional注解，符合Linux条件则实例化linuxListService
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }
}
