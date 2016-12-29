package com.lucky.ch01.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lucky on 12/29/16.
 */
@Configuration
public class ConfigService {

    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public FunctionServiceImpl functionServiceImpl() {
        return new FunctionServiceImpl(functionService());
    }

}
