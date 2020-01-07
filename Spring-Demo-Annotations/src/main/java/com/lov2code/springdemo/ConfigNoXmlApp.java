package com.lov2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigNoXmlApp {
	
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigNoXml.class);
		
		SwimCoach theCoach=ctx.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(theCoach.gerDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getCricket());
        System.out.println(theCoach.getTennis());
		ctx.close();
		
	}

}
