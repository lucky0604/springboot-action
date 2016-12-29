package com.lucky.ch02.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lucky on 16-12-30.
 */
public class RunApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
