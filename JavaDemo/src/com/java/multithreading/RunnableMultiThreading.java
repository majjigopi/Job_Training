package com.java.multithreading;

public class RunnableMultiThreading implements Runnable {

	@Override
	public void run() {
		for (int k=0;k<20;k++)
		{
			System.out.println("---->"+"executing child thread");
		}
		
	}

}
