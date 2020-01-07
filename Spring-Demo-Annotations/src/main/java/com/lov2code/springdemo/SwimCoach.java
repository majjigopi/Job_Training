package com.lov2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${tennis}")
	private String tennis;
	
	public String getTennis() {
		return tennis;
	}

	@Value("${cricket}")
	private String cricket;
	
	

	public String getCricket() {
		return cricket;
	}

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String gerDailyWorkOut() {
	
		return "swim hard for 12345 nautiacal miles";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
