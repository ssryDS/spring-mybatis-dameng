package com.dm.service;

import com.dm.entity.Departments;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface DeptService {

    List<Departments> getDeptList();
}
