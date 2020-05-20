package com.java.collections;

import java.util.HashSet;

public class Emp {
int empId;
String empName;
	Emp(int empId, String empName){
		this.empId=empId;
		this.empName=empName;
		
}
	
	
	public static void main(String args[])
	{
	HashSet sh=new HashSet();	
	sh.add(new Emp(3444,"gopi") );
	sh.add(new Emp(3444,"gopi") );
	System.out.println(sh);
}
	
}
