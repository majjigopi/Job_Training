package com.java.multithreading;

import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class ReentrantLockExample{
	
	ReentrantLockExample(int a,int b)
	{
		
	}
	
	public static  void main(String[] args)
	{
		Dsiplay d=new Dsiplay();
		Dsiplay d1=new Dsiplay();
		Dsiplay d2=new Dsiplay();
		ReentrantThread thread_1=new ReentrantThread(d, "Dhoni");
		ReentrantThread thread_2=new ReentrantThread(d1, "yuvaraj");
		ReentrantThread thread_3=new ReentrantThread(d2, "Power_Star");
		thread_1.start();
		thread_2.start();
		thread_3.start();
		
	}

}
