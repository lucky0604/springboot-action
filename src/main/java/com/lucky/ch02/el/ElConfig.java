package com.lucky.ch02.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;

/**
 * Created by lucky on 12/29/16.
 */
@Configuration
@ComponentScan("com.lucky.ch02.el")
@PropertySource("classpath:com/lucky.ch02/el/test.properties")
public class ElConfig {

    @Value("I love you")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{ElService.another}")
    private String fromAnother;

    @Value("classpath:com/lucky/ch02/el/test.txt")
    private Resource testFile;

    
}
