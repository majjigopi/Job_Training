package com.luv2code.springdemo.beanLifeCycle.initAnddestroy;

public class InitDestroy {

	
	public void init()
	{
		System.out.println("this method is called during initialization of spring bean");
	}
	
	public void destroy()
	{
		System.out.println("this method is called during destruction phase");
	}
}
