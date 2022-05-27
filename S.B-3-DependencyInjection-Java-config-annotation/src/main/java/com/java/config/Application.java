package com.java.config;

import com.java.config.beans.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		Student student = ctx.getBean("stud",Student.class);
		student.preparation("OCJP");

		((ConfigurableApplicationContext)ctx).close();

	}

}
