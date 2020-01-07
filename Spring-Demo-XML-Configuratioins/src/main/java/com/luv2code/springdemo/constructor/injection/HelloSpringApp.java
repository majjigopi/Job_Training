package com.luv2code.springdemo.constructor.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/luv2code/springdemo/constructor/injection/applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("Base_Ball_Coach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	
		
		// close the context
		context.close();
	}

}







