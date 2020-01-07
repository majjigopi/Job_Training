package com.luv2code.springdemo.constructor.injection;

public class TrackCoach implements Coach {
	
	private HappyFortuneService fortuneService;

	public TrackCoach(HappyFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it :"+fortuneService.getfortune();
	}

	

}










