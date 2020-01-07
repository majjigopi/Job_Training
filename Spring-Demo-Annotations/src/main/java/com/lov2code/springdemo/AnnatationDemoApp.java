package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnatationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
	Coach  thecoach	=ctx.getBean("tennisCoach",Coach.class);
	System.out.println(thecoach.gerDailyWorkOut());
	System.out.println(thecoach.getDailyFortune());

	
	ctx.close();
		

	}

}
