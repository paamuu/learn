package com.example.demo.mapper;

import com.example.demo.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {
    List<City> getAllCity();
}
