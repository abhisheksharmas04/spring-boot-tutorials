package com.java.config.beans;

import javax.inject.Named;

@Named("DotNet")
public class DotNetCourse implements ICourseMaterial{

    public DotNetCourse() {
        System.out.println("DotNetCourse 0-Param Constructor");
    }

    @Override
    public String courseContent() {
        return "1.Dot Net Fundamentals 2.ExceptionHandling in .Net";
    }

    @Override
    public double price() {
        return 600;
    }
    
}
