package com.lucky.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by lucky on 1/6/17.
 *
 * 类型安全的Bean
 */
@Component
// 通过ConfigurationProperties加载properties文件内的配置，通过prefix属性指定properties的配置的前缀
@ConfigurationProperties(prefix = "author")
public class AuthorSettings {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
