package com.java8.functional.Interface.FucntionalAndConsumer;

import java.util.function.Consumer; 
public class ConsumerFunctionChaining {
	
	
	public static void main(String args[])
	{
		Consumer<String> consume1=str-> System.out.println(str.length());
		Consumer<String> consume2=str-> System.out.println(str.charAt(6));
		
	//	consume1.accept("hello vasavi");
		 //using accept functional interface
		//fucntion chaining 
		Consumer consume3=consume1.andThen(consume2);
				consume3.accept("hello vasavi");
		
	}

}
