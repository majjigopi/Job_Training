package com.java.multithreading;

public class ReentrantThread extends Thread {
	Dsiplay d;
	String name;
	
	ReentrantThread(Dsiplay d,String name)
	{
		this.d=d;
		this.name=name;
				
	}
	public void run()
	{
		d.wish(name);
		Dsiplay.testExecution();
	}
	

}
