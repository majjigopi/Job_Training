package com.lov2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "hey I am from DataBaseFortune service";
	}

}
