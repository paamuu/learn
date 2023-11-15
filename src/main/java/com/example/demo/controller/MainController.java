package com.example.demo.controller;

import com.example.demo.entity.City;
import com.example.demo.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    CityMapper cityMapper;

    @GetMapping("/hello")
    public String hello() {
        return "hello worldddd";
    }

    @RequestMapping("/cities")
    public List<City> getCity() {
        return cityMapper.getAllCity();
    }
}
