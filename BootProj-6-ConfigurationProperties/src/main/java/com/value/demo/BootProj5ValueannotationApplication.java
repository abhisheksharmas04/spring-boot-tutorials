package com.value.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.value.demo.beans.CompanyDetails;

@SpringBootApplication
public class BootProj5ValueannotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj5ValueannotationApplication.class, args);
		 
		CompanyDetails details = ctx.getBean("company", CompanyDetails.class);
		
		System.out.println("data:: " + details);
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
