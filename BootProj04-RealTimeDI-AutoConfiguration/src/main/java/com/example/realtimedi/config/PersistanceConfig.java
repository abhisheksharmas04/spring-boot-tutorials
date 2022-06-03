package com.example.realtimedi.config;

import java.beans.PropertyVetoException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class PersistanceConfig {
	
	@Autowired
	private Environment env;
	// By default all the information of properties file will come and store into environment 	object. IOC container creates Environment object automatically as a part of starters.
	
	@Bean(name = "C3p0ds")
	public ComboPooledDataSource createDs() throws Exception {
		ComboPooledDataSource c3p0ds = new ComboPooledDataSource();
		c3p0ds.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
		c3p0ds.setJdbcUrl(env.getProperty("spring.datasource.url"));
		c3p0ds.setUser(env.getProperty("spring.datasource.username"));
		c3p0ds.setPassword(env.getProperty("spring.datasource.password"));
		
		return c3p0ds;
	}

}
