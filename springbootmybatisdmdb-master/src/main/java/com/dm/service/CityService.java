package com.dm.service;

import com.dm.entity.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
    List<City> getCityList();
    Integer getCount();
}
