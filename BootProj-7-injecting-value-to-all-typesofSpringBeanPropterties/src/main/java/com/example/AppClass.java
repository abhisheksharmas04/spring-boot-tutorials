package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.Employee;

@SpringBootApplication
public class AppClass {

	public static void main(String[] args) {
		// get IOC Container
		ApplicationContext ctx =  SpringApplication.run(AppClass.class, args);
		
		//get spring bean:
		Employee emp = ctx.getBean("emp", Employee.class);
		System.out.println(emp);
		
		//close container
		((ConfigurableApplicationContext)ctx).close();
	}

}
