package com.bharath.spring.springcore.dependecy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/bharath/spring/springcore/dependecy/springconfig.xml");
		Student student=(Student)ctx.getBean("student");
		System.out.println(student.getScores());
		System.out.println();
	}

}
