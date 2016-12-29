package com.lucky.ch02.profile;

/**
 * Created by lucky on 16-12-29.
 *
 * Profile为在不同环境中使用不同的配置提供了支持(开发环境下的配置和生产环境下的配置肯定是不同的，例如数据库的配置)
 * 1> 通过设定Environment的ActiveProfiles来设定当前context需要使用的配置环境，在开发中使用@Profile注解类或方法，达到在不同情况下选择实例化不同的Bean
 * 2> 通过设定jvm的spring.profiles.active参数来设置配置环境
 * 3> Web项目设置在Servlet的context parameter中
 */
public class DemoBean {
    private String content;

    public DemoBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
