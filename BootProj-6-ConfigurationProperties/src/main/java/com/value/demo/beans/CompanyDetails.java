package com.value.demo.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("company")
@ConfigurationProperties(prefix = "example.value")
public class CompanyDetails {

	private String one;
	private String two;
	private String three;

	public String getOne() {
		return one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public String getTwo() {
		return two;
	}

	public void setTwo(String two) {
		this.two = two;
	}

	public String getThree() {
		return three;
	}

	public void setThree(String three) {
		this.three = three;
	}

	@Override
	public String toString() {
		return "CompanyDetails [one=" + one + ", two=" + two + ", three=" + three + "]";
	}

}
