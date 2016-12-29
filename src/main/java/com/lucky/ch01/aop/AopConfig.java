package com.lucky.ch01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by lucky on 12/29/16.
 */
@Configuration
@ComponentScan("com.lucky.ch01.aop")
// 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ代理的支持
@EnableAspectJAutoProxy
public class AopConfig {
}
