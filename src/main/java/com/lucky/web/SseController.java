package com.lucky.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created by lucky on 1/6/17.
 *
 * 此例演示提供基于SSE(Server Send Event)的服务器端推送和基于Servlet3.0+的异步方法特性
 */
@Controller
public class SseController {
    // 使用输出媒体类型为test/event-stream ，这是服务器端SSE的支持，代码演示每5秒向浏览器推送随机消息
    @RequestMapping(value = "/push", produces = "text/event-stream")
    public @ResponseBody String push() {
        Random r = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data: Testing 1, 2, 3" + r.nextInt() + "\n\n";
    }
}
