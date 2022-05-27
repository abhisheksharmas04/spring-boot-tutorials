package com.java.config.beans;

import javax.inject.Inject;
import javax.inject.Named;
/*
    @Inject can be use for field level constructor level setter method level
    arrbitiry method level injection whereas @Resource can be used for field level, method level arrbitory method level but not for constructor level.

    while working with @Inject we need to add @Named to solve ambiguity problem where as while working with @Resource its name param itself can be used to solve the same problem.

    To use different java config annotation we need to add different jar files for working with @Inject, @Resource, @Named annotaions add javax.inject jar in pom.xml.
 */

@Named("stud")
public class Student {
    @Inject
    @Named("Java")
    private ICourseMaterial courseMaterial;

    public void preparation(String examName){
        System.out.println("Preparation Started for " + examName);
        String courseContent = courseMaterial.courseContent();
        double price = courseMaterial.price();
        System.out.println("Preparation is going on using " + courseContent + " with material price " + price);
        System.out.println("Preparation completed for " + examName);

    }
}
