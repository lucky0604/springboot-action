package com.lucky;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lucky on 1/6/17.
 */
@RestController
@SpringBootApplication
public class RunApplication {

    // 常规属性的配置
    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    String index() {
        return "book name is: " + bookName + " and book author is : " + bookAuthor;
    }
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
}
