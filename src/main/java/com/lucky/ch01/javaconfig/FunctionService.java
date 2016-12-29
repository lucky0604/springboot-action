package com.lucky.ch01.javaconfig;

/**
 * Created by lucky on 12/29/16.
 *
 * Java配置是Spring4.x推荐配置方式，可完全替代xml配置
 * 主要通过@Configuration和@Bean来实现
 * @Configuration声明当前类是一个配置类，相当于一个Spring配置的xml文件
 * @Bean注解在方法上，声明当前方法的返回值为一个Bean
 */
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
