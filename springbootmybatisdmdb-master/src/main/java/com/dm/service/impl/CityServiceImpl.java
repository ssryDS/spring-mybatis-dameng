package com.dm.service.impl;

import com.dm.entity.City;
import com.dm.mapper.CityMapper;
import com.dm.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityMapper cityMapper;

    @Override
    public List<City> getCityList() {
        return cityMapper.getCityList();
    }

    @Override
    public Integer getCount() {
        return cityMapper.getCount();
    }
}
