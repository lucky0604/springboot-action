package com.lucky.config;

import com.lucky.messageconverter.MyMessageConverter;
import com.lucky.web.DemoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * Created by lucky on 17-1-2.
 */
/**
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
*/

// --------------------------------------------------------------
/*
Spring MVC的定制配置需要我们的配置类继承一个WebMvcConfigurerAdapter类，并在此类使用@EnableWebMvc注解，来开启对SpringMVC的支持
此例演示加载静态资源
 */
@Configuration
@EnableWebMvc
@EnableScheduling    // 开启对异步任务支持
@ComponentScan("com.lucky")
public class MvcConfig extends WebMvcConfigurerAdapter {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // addResourceHandler指的是对外暴露的访问路径，addResourceLocations指的是文件放置的路径
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
    }

    /*
    拦截器配置
     */
    @Bean
    public DemoInterceptor demoInterceptor() {
        return new DemoInterceptor();
    }
    // 重写addInterceptors，注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor());
    }

    // MultipartResolver配置
    @Bean
    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(1000000);
        return multipartResolver;
    }

    /*
    HttpMessageConverter配置
     */
    // 配置HttpMessageConverter Bean
    @Bean
    public MyMessageConverter converter() {
        return new MyMessageConverter();
    }

    // 重写extendMessageConverters
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(converter());
    }
}