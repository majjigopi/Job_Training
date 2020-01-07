package com.java.multithreading;

//Java program to illustrate yield() method 
//in Java 
import java.lang.*; 

//MyThread extending Thread 
class YeildExample extends Thread 
{ 
	public void run() 
	{ 
		for (int i=0; i<5 ; i++) 
			System.out.println(Thread.currentThread().getName() 
								+ " in control"); 
	} 
} 

//Driver Class 


