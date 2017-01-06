package com.lucky;

import com.lucky.config.AuthorSettings;
import com.lucky.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 1/6/17.
 */
@Controller
@SpringBootApplication
public class RunApplication {

    /*
    // 常规属性的配置
    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;
*/

    /**
     * 类型安全的配置
     * @return
     */
    /*
    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/")
    String index() {
        // return "book name is: " + bookName + " and book author is : " + bookAuthor;
        return "author name is " + authorSettings.getName() + " and author age is " + authorSettings.getAge();
    }
    */

    /**
     * 利用thymeleaf获取数据
     * @param args
     */
    @RequestMapping("/")
    public String index(Model model) {
        Person single = new Person("aa", 11);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("xx", 11);
        Person p2 = new Person("yy", 22);
        Person p3 = new Person("zz", 33);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
}
