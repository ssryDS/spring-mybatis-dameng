package com.dm.controller;

import com.dm.entity.City;
import com.dm.entity.Departments;
import com.dm.service.CityService;
import com.dm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private CityService cityService;

    @Autowired
    private DeptService deptService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/getCityList")
    public List<City> getCityList(){
        return cityService.getCityList();
    }

    @GetMapping("/getCount")
    public Integer getCount(){
        return cityService.getCount();
    }

    @GetMapping("/getDeptList")
    public List<Departments> getDeptList(){
        return deptService.getDeptList();
    }
}
