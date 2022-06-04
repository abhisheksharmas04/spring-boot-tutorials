package com.example.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Company {
	
	private String title;
	private String location;
	private int size;

}
