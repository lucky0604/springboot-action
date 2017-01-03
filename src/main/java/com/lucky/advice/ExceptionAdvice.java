package com.lucky.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lucky on 17-1-3.
 *
 * 通过@ControllerAdvice可以将对于控制器的全局配置放置在同一个位置
 * 注解了@Controller的类的方法可使用@ExceptionHandler @InitBinder @ModelAttribute注解到方法上，对所有注解了@RequestMapping的控制器内的方法有效
 *
 * @ExceptionHandler：用于全局处理控制器里的异常
 * @InitBinder：用来设置WebDataBinder，WebDataBinder用来自动绑定前台请求参数到Model中
 * @ModelAttribute：本来的作用是绑定键值对到Model里，此处是让全局的@RequestMapping都能获得在此处设置的键值对
 */
// @ControllerAdvice声明一个控制器建言，组合了@Component注解，所以自动成为Spring的Bean
@ControllerAdvice
public class ExceptionAdvice {
    // 在此处定义全局处理，通过value属性可过滤拦截器
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");    // error页面
        modelAndView.addObject("errorMessage", exception.getMessage());
        return modelAndView;
    }

    // 此注解将键值对添加到全局，所有注解了@RequestMapping的方法可获得此键值对
    @ModelAttribute
    public void addAttribute(Model model) {
        model.addAttribute("msg", "额外信息");
    }

    // 通过此注解定制WebDataBinder
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        // 此处为忽略request参数的id
        webDataBinder.setDisallowedFields("id");
    }
}
