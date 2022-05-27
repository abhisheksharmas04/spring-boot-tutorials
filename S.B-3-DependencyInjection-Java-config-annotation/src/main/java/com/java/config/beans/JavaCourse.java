package com.java.config.beans;

import javax.inject.Named;

@Named("Java")
public class JavaCourse implements ICourseMaterial{

    public JavaCourse() {
        System.out.println("JavaCourse class 0-param constructor");
    }

    @Override
    public String courseContent() {
        return "1.Exception Handling, 2.OOPS Concepts, 3.File IO, 4.Interfaces";
    }

    @Override
    public double price() {
        return 500;
    }
    
}
