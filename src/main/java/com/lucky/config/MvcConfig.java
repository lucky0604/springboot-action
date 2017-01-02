package com.lucky.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by lucky on 17-1-2.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.lucky")
public class MvcConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        // 配置jsp的viewResolver用来映射路径和实际页面的位置
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }
}
