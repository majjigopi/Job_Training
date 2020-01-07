package com.bharath.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		/*Employee emp=(Employee) ctx.getBean("emp");
		System.out.println(emp.getName());
		System.out.println(emp.getId());*/
		Hospital hsp=(Hospital) ctx.getBean("hospital");
		System.out.println(hsp.getName());
		System.out.println(hsp.getPatientDetails());
		
	}

}
