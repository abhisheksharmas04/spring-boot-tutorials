package com.value.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Bill")
public class BillGenerator {

	@Value("#{Info.idlyPrice + Info.dosaPrice + Info.pohaPrice}")
	private float total;
	@Value("Paradize")
	private String holtelName;

	@Autowired
	ItemInfo item;

	@Override
	public String toString() {
		return "BillGenerator [total=" + total + ", holtelName=" + holtelName + ", item=" + item + "]";
	}

}
