package com.dm.service.impl;

import com.dm.entity.Departments;
import com.dm.mapper.DepartmentMapper;
import com.dm.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Departments> getDeptList() {
        return departmentMapper.getDeptList();
    }
}
