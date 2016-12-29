package com.lucky.ch02.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lucky on 16-12-29.
 */
@Configuration
@ComponentScan("com.lucky.ch02.prepost")
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
