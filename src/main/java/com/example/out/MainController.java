package com.example.out;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//这个包不在约定的目录中，不会被spring扫描
@RestController
public class MainController {

    @GetMapping("/out")
    public String hello() {
        return "hello worldddd";
    }
}
