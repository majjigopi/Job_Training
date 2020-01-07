package com.lov2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Hey I am restFortune service ";
	}

}
