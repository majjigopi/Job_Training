package com.java.multithreading;

public class yieldDemo 
{ 
	public static void main(String[]args) 
	{ 
		YeildExample t = new YeildExample(); 
		t.start(); 

		for (int i=0; i<5; i++) 
		{ 
			// Control passes to child thread 
			Thread.yield(); 

			// After execution of child Thread 
			// main thread takes over 
			System.out.println(Thread.currentThread().getName() 
								+ " in control"); 
		} 
	} 
} 