package com.example.realtimedi.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDto implements Serializable{
    private Integer srNo;
    
    private Integer empNo;
    private String ename;
    private String job;
    private Double sal;
    private Integer deptNo;
    private Integer mgrNo;
    
}
