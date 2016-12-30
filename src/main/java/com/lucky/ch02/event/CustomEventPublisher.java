package com.lucky.ch02.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by lucky on 12/30/16.
 */
@Component
public class CustomEventPublisher {
    // 注入ApplicationContext用来发布事件
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        // 使用applicationContext的publishEvent方法来发布
        applicationContext.publishEvent(new CustomEvent(this, msg));
    }
}
