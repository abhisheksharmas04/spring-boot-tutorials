package com.example.realtimedi.service;

import java.util.List;

import com.example.realtimedi.dto.EmployeeDto;

public interface IEmployeManagementService {
    public List<EmployeeDto> fetchEmployeesByDesgs(String desgs[]) throws Exception;
}
