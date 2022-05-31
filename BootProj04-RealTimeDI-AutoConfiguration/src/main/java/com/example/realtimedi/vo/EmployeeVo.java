package com.example.realtimedi.vo;

public class EmployeeVo {
    
    private Integer empNo;
    private String ename;
    private String job;
    private String sal;
    private String deptNo;
    private String mgrNo;
}

/*
    While developing Java bean it recomanded to take wrapper data type(like Integer,Long,Double and etc..) bean properties rather  simple data types(int,long,double,and etc) becoz simple type numberic value holds "0" as default value where as wrapper hold null.
 */