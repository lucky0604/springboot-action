package com.lucky.ch03.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by lucky on 12/30/16.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
// 组合@Configuration元注解
// 组合@ComponentScan元注解
@Configuration
@ComponentScan
public @interface WiselyConfiguration {
    // 覆盖value参数
    String[] value() default {};
}
