package com.luv2code.springdemo.beanLifeCycle.initAnddestroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/luv2code/springdemo/beanLifeCycle/initAnddestroy/applicationContext.xml");
				
		// retrieve bean from spring container
		InitDestroy initdestroy = context.getBean("init_destroy", InitDestroy.class);
		
		
		context.close();
	}

}







