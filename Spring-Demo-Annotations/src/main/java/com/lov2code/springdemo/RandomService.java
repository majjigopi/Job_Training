package com.lov2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	public String getFortune() {
		
		return "hey I am Random fortune service";
	}

}
