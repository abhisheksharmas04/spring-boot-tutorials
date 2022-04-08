package com.example.demo.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime time;
	
	public String generateWishMSG(String user) {
		int hours = time.getHour();
		
		if(hours > 12) {
			return "Good Morning " + user;
		}else if (hours < 16) {
			return "Good AfterNoon " + user;
		}else if(hours < 20) {
			return "Good Evening " + user;
		}else {
			return "Good Night " + user;
		}
	}

}
