package com.java8.functional.Interface.Predicate;

import java.util.function.*;

public class PredicateFunctionalInterf {
	
	public static void main(String args[])
	{
		Predicate<Integer> pre= I -> I>10 ;
		System.out.println(pre.test(100));
		System.out.println(pre.test(5));
	}

}
