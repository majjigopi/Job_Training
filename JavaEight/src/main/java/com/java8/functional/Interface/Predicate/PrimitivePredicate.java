package com.java8.functional.Interface.Predicate;

import java.util.function.IntPredicate;


public class PrimitivePredicate {

	
	public static void main(String[] args) {
		IntPredicate predicate = a -> a > 0;
		System.out.println(predicate.test(5));
		System.out.println(predicate.test(-5));
	}
}
