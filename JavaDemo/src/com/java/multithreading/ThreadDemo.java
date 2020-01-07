package com.java.multithreading;

public class ThreadDemo {


	public static void main(String[] args) {
	
		YeildExample thread=new YeildExample();
		thread.start();
		YeildExample thread1=new YeildExample();
		thread1.start();
		
		for(int j=0;j<10;j++)
		{
			System.out.println(j +"------>");
		}

	}

}
