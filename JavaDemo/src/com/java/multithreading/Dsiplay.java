package com.java.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Dsiplay {
	
	ReentrantLock l=new ReentrantLock();
	public void wish(String name)
	{
		l.lock();
		for(int i=0;i<2;i++)
		{
			System.out.println("Good Morning :");
			try
			{
				Thread.sleep(5000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.print(name);
		}
		l.unlock();
	}
	
	public static  void testExecution()
	{
		System.out.println("static level lock test");
	}

}
