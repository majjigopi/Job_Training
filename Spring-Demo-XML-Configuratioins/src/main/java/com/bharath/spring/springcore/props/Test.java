package com.bharath.spring.springcore.props;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/bharath/spring/springcore/props/springconfig.xml");
		props customer=(props)ctx.getBean("property");
		System.out.println(customer.getPro());
	}

}
