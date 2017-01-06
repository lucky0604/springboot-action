package com.lucky.config;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * Created by lucky on 17-1-2.
 */
// 实现WebApplicationInitializer，此接口是Spring提供用来配置Servlet3.0+配置的接口，从而实现替代web.xml。实现此接口将会自动被SpringServletContainerInitializer获取到
public class WebConfig implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MvcConfig.class);
        // 新建WebApplicationContext，注册配置类，并将其和当前ServletContext关联
        context.setServletContext(servletContext);
        // 注册SpringMVC的DispatcherServlet
        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        // 开启异步方法支持
        servlet.setAsyncSupported(true);
    }
}
