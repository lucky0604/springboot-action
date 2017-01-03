package com.lucky.web;

import com.lucky.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lucky on 17-1-2.
 *
 * 演示几种注解的控制器
 */
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {
    // 此映射未标注路径，应用默认类路径,produces可定制返回response的媒体类型和字符集
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    // 演示可接受HttpServletRequest作为参数，也可以接受HttpServletResponse作为参数，此处的@ResponseBody用在返回值前面
    public @ResponseBody String index(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }

    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    //演示接受路径参数，并在方法参数前结合@PathVariable使用，访问路径为/anno/pathvar/xx
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access, str: " + str;
    }

    // 演示常规的request参数获取，访问路径为/anno/requestParam?id=1
    @RequestMapping(value = "requestParam", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(Long id, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access, id: " + id;
    }

    // 演示解释参数到对象，访问路径为/anno/obj?id=1&name=xx
    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    // @ResponseBody也可用在方法上
    @ResponseBody
    public String passObj(DemoObj obj, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access, obj id : " + obj.getId() + " obj name: " + obj.getName();
    }

    // 演示映射到不同的路径到相同的方法上，访问路径为/anno/name1, /anno/name2
    @RequestMapping(value = {"/name1", "/name2"}, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String remove(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }
}
