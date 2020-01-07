package com.java8.Interface.DefaultOrStatic.methods;

public class DefaultMehodsImplimentingInClass implements  DefaultMethodsInInterface1,DefaultMethodsInInterface2 {
	
	

	public static void main(String[] args) {
		
		Object obj=new Integer(6);
	
		
		new DefaultMehodsImplimentingInClass().m1();

	}
	// test
// we have  to overide m1 method because it is present in both implemented interfaces in this class 
	@Override
	public void m1() {
		//we can overide default method in child class
		DefaultMethodsInInterface1.super.m1();//if we want to call default method in the  interface DefaultMethodsInInterface1
		DefaultMethodsInInterface2.super.m1();//if we want to call default method in the  interface DefaultMethodsInInterface2
	}

}
