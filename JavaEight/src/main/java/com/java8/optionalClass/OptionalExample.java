package com.java8.optionalClass;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String args[])
	{
		String book = "Java8";
		// with out using Optional to check null values
		
		if(book != null)
		{
			System.out.println(book.toUpperCase());
		}
		else
		{
			book ="Java8";
			System.out.println(book.toUpperCase());
		}
		
		//Using optional which reduces boiler plate code
		
		String book1=null;
		//this method return optional object and takes null and non null values
		Optional<String> checkNull=Optional.ofNullable(book1);
		
		// does not accepts null values if we run this code it gives null pointer exception
		//Optional<String> dontTakeNull= Optional.of(book1);
		
		
		//below code replaces the code from line 12 to line 20
			System.out.println(checkNull.orElse("Java9").toUpperCase());
			
			//get the value present in the object 
			//System.out.println(checkNull.get());
		
		
 		
		
	}

}
