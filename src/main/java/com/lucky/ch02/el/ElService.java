package com.lucky.ch02.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by lucky on 12/29/16.
 *
 * Spring EL-spring表达式语言支持在xml和注解中使用表达式，类似于jsp的EL表达式
 * 主要在注解@Value的参数中使用表达式
 */
@Service
public class ElService {
    // 注入普通字符串
    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
