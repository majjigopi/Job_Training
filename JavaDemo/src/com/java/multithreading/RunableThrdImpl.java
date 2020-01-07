package com.java.multithreading;

public class RunableThrdImpl {
	
	
	public static void testThreadPriority()
	{
		Thread thread=new Thread(new RunnableMultiThreading());
		thread.setPriority(10);
		thread.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Executing main thread");
		}
	}
	
	public static void main(String args[])
	{
		//Thread thread=new Thread(new RunnableMultiThreading());
		//thread.start();
		RunableThrdImpl.testThreadPriority();
	}

}
