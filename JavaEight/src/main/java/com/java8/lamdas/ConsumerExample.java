package com.java8.lamdas;

import java.util.function.Consumer;

public class ConsumerExample {

	
	public static void main(String args[])
	{
		
		/*Consumer<String> s1;*/
		Consumer<String> c1=(s)-> System.out.println(s.toUpperCase());
		c1.accept("java8");
		
	}
}
