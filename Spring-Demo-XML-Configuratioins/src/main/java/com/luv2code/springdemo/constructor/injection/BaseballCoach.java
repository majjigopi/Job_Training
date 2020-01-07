package com.luv2code.springdemo.constructor.injection;

public class BaseballCoach implements Coach {
	
	private MyFortuneService fortuneService;
	
	private TrackCoach trackCoach;
	
	
	public BaseballCoach(MyFortuneService fortuneService, TrackCoach trackCoach) {
		this.fortuneService = fortuneService;
		this.trackCoach = trackCoach;
		System.out.println(this.trackCoach);
	}



	public BaseballCoach(MyFortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}



	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getfortune();
	}


}








