package com.java8.Interface.DefaultOrStatic.methods;

public interface DefaultMethodsInInterface1 {
	
	default void m1() {
		System.out.println("I am default method in interface1");
	}
	
	public static  void staticMethod()
	{
		System.out.println("am static method from DefaultMethodsInInterface1");
		//static methods are not available to child class we can call static method by  only writing statement like this
		//DefaultMethodsInInterface1.methodName();
	}
	
	
	public static void main(String args[])
	{
		DefaultMethodsInInterface1.staticMethod();
		
		
	}

}
