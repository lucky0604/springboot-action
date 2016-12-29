package com.lucky.ch01.aop;

import org.springframework.stereotype.Service;

/**
 * Created by lucky on 12/29/16.
 *
 * 使用注解的被拦截类
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {};
}
