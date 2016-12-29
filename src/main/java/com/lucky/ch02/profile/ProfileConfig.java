package com.lucky.ch02.profile;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by lucky on 16-12-30.
 */
@Configuration
public class ProfileConfig {
    @Bean
    // Profile为dev时实例化devDemoBean
    @Profile("dev")
    public DemoBean devDemoBean() {
        return new DemoBean("from develop profile");
    }

    @Bean
    // Profile为prod时实例化prodDemoBean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return new DemoBean("from production profile");
    }
}
