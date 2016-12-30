package com.lucky.ch03.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by lucky on 12/30/16.
 */
@Service
public class AnnotationService {
    public void outputResult() {
        System.out.println("从组合注解配置照样获得的Bean");
    }
}
