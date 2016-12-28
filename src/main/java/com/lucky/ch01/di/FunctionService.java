package com.lucky.ch01.di;

import org.springframework.stereotype.Service;

/**
 * Created by lucky on 16-12-29.
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + "!";
    }
}
