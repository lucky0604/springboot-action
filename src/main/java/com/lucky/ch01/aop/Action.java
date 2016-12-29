package com.lucky.ch01.aop;

import java.lang.annotation.*;

/**
 * Created by lucky on 12/29/16.
 *
 * 拦截规则的注解类
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
