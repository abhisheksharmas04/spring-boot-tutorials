package com.value.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("Info")
@PropertySource("com/value/demo/commons/inputs.properties")
public class ItemInfo {
	@Value("${dosa.price}")
	public float idlyPrice;
	@Value("${idly.price}")
	public float dosaPrice;
	@Value("${poha.price}")
	public float pohaPrice;
	
	@Override // alt+shift+s,s
	public String toString() {
		return "ItemInfo [idlyPrice=" + idlyPrice + ", dosaPrice=" + dosaPrice + ", pohaPrice=" + pohaPrice + "]";
	}
	
}
