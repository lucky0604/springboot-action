package com.lucky.ch02.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by lucky on 12/30/16.
 */
@Component
// 实现ApplicationListener接口，并指定监听的事件类型
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    // 使用onApplicationEvent方法对消息进行接受处理
    public void onApplicationEvent(CustomEvent event) {
        String msg = event.getMsg();
        System.out.println("我(bean-CustomListener)接收到了bean-CustomEventPublisher发布的消息：" + msg);
    }
}
