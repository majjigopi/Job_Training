package com.java8.MethodAndConstructorReference;

public class Test {
	
	public static void m2()
	{
		System.out.println("Method2 implimentations");
	}
	
	public void m3()
	{
		System.out.println("method3 reference");
	}

	public static void main(String args[])
	{
		MethodReferenceInterf i=Test::m2; // injecting method two reference in to method m1 for referring static methods
		
		
		i.m1();
		
		Test t=new Test();
		
		MethodReferenceInterf k=t::m3;
		
		k.m1();//calling method m3 indirectly by referring in to m1
		
		//constructor reference
		
		ConstructorReferenceInterf c=Sample::new;
		
		c.getSampleObject();
	}
}
