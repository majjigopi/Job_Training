package com.java8.functional.interfaces.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
	
	
	public static void main(String args[])
	{

		
		Supplier<Date> s=()->new Date();
		
		System.out.println(s.get());

		
		
	}

}
