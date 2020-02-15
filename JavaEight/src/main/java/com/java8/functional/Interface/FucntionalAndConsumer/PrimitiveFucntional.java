package com.java8.functional.Interface.FucntionalAndConsumer;
import java.util.function.IntFunction;

public class PrimitiveFucntional {
	
	public static void main(String args[]) {
	 IntFunction<Integer>  func= x-> x*x ;
	 
	 func.apply(10);
	}
}
