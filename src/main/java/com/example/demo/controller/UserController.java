package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    /**
     * 自动访问templates下的内容，返回值就是对应的html文件名，后缀可以省略 依赖 spring-boot-starter-thymeleaf
     * @return
     */
    @RequestMapping("/test")
    public String test() {
        return "login";
    }
}
