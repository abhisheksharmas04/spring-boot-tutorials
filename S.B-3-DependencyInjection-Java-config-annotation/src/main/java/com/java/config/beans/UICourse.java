package com.java.config.beans;

import javax.inject.Named;

@Named("Ui")
public class UICourse implements ICourseMaterial{

    public UICourse() {
        System.out.println("UICourse class 0-Param-Constructor");
    }

    @Override
    public String courseContent() {
        return "1.HTML, 2.CSS, 3.JavaScript, 4.BootStrap";
    }

    @Override
    public double price() {
        return 200;
    }
    
}
