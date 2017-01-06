package com.lucky.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import org.springframework.scheduling.annotation.Scheduled;


/**
 * Created by lucky on 1/6/17.
 *
 * 服务端推送定时任务
 */
// 在PushService里产生DeferredResult给控制器用，通过@Scheduled注解的方法定时更新DeferredResult
@Service
public class PushService {
    private DeferredResult<String> deferredResult;

    public DeferredResult<String> getAsyncUpdate() {
        deferredResult = new DeferredResult<String>();
        return deferredResult;
    }

    @Scheduled(fixedDelay = 5000)
    public void refresh() {
        if (deferredResult != null) {
            deferredResult.setResult(new Long(System.currentTimeMillis()).toString());
        }
    }
}