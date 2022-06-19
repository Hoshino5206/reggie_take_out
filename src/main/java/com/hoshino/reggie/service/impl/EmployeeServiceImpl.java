package com.hoshino.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hoshino.reggie.entity.Employee;
import com.hoshino.reggie.mapper.EmployeeMapper;
import com.hoshino.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService{
}
