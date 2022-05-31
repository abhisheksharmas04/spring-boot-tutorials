package com.example.realtimedi.dao;

import java.util.List;

import com.example.realtimedi.bo.EmployeeBo;

public interface IEmployeeDao {
    public List<EmployeeBo> getEmployeesByDes(String condition) throws Exception;
}
