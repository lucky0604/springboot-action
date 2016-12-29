package com.lucky.ch01.javaconfig;

/**
 * Created by lucky on 12/29/16.
 */
public class FunctionServiceImpl {
    FunctionService functionService;

    public FunctionServiceImpl(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}
