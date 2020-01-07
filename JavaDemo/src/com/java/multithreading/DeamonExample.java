package com.java.multithreading;

public class DeamonExample extends Thread
{
	public void run()
	{
		for (int j=0;j<6;j++)
		{
			try {
				Thread.sleep(5000);
				System.out.println(j);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
public static void main(String args[])
{
	DeamonExample d=new DeamonExample();
	d.setDaemon(true);
	d.start();
    System.out.println("End of main");
	}
}
