package com.java8.fucntional.Interface.Predicate;

import java.util.function.Predicate;

public class PredicatJoining {
	
	
	
	
	public static void main(String args[])
	{
		int[] arr= {16};
	    
		Predicate<Integer> checkGreater= I -> I>10;    //checks number is greater than 10 or not 
		Predicate<Integer> checkPrime = I -> I%2==0;   //checks nuber is prime or not 
		
		System.out.println(checkGreater.test(16));
		System.out.println(checkPrime.test(16));
		
		predicateAndJoining(checkGreater.and(checkPrime),arr);
		predicateAndJoining(checkGreater.or(checkPrime),arr);
		predicateAndJoining(checkGreater.negate(),arr);
		
	}
	
	
	
	public static void predicateAndJoining(Predicate<Integer> p,int[] x)
	{
	
		for(int y:x)
		{
			System.out.println(p.test(y));
		}
	}

}
