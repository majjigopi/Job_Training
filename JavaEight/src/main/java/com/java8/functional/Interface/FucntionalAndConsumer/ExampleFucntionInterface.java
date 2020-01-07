package com.java8.functional.Interface.FucntionalAndConsumer;
import java.util.function.*;

public class ExampleFucntionInterface {
	
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> f1=i->i+i;
		Function<Integer,Integer> f2=i->i*i*i;
		
		System.out.println(f1.apply(2));
		System.out.println(f2.apply(3));
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(3));
 		
	}

}
