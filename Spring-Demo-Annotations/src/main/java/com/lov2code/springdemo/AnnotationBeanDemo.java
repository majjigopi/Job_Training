package com.lov2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.spring.noxml.Config;

public class AnnotationBeanDemo {

	public static void main(String[] args) {
		// if we want to configure application context using config class it works same as loading application contxt.xml
		//AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Coach  thecoach	=ctx.getBean("tennisCoach",Coach.class);
		Coach  theextracoach	=ctx.getBean("tennisCoach",Coach.class);
		if(thecoach == theextracoach)
		{
			System.out.println("both are same coaches");
		}
		else 
			System.out.println("both are different coaches");

	}

}
