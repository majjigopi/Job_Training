package com.java.collections;


class SubClass extends TestClass{  
	  //defining the same method as in the parent class  
	  void run(){System.out.println("Bike is running safely");}  
	  
	  public static void main(String args[]){  
		  TestClass obj = new SubClass();//creating object  
	  obj.run();//calling method  
	  }  
	}  
