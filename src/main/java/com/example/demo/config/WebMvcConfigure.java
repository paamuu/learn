package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfigure implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry  registry) { // 路径映射资源图片等其他资源不是试图资源
        registry.addResourceHandler("/").addResourceLocations("login.html");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) { // 路径映射页面访问/地址就会访问到login.html
        registry.addViewController("/").setViewName("login.html");
    }
}
