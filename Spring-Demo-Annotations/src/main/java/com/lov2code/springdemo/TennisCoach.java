package com.lov2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //registers component in spring to create objects.
@Scope("singleton") //tells the spring weather give same object or different object when ever spring gives object
public class TennisCoach implements Coach {
	
	
	@Value("${tennis}")
	private String tennis;
	    
	@Value("${cricket}")
	private String cricket;

	public TennisCoach() {
		
		
	}

	@Autowired //field injection using autowired. 
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
     @Autowired //setter injection 
     
	public void setFortuneService(@Qualifier("restFortuneService") FortuneService fortuneService) {
		//this.fortuneService = fortuneService;
		System.out.println(fortuneService.getFortune());
	}

	@Autowired //constructor injection using autowired 
	
	public TennisCoach( @Qualifier("dataBaseFortuneService") FortuneService fortuneService) {
		
		System.out.println(fortuneService.getFortune());
		
	}

	public String gerDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practise backhand volley";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	 @PostConstruct
	public void doMyStartUpStuf() 
	{
		System.out.println("Called startup stuff method ");
	}
	 
	 @PreDestroy
	 public void doMyEndUpStuff()
	 {
		 System.out.println("called pre destroy method");
		 
	 }
}
