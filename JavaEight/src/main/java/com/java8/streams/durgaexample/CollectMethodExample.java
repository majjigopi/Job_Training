package com.java8.streams.durgaexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMethodExample {
	
	public static Integer findMaxInteger()
	{

			ArrayList<Integer> al=new ArrayList<Integer>();
			
			Integer i5= al.stream().max((i1,i2) ->i1.compareTo(i2)).get();
			
			return i5;
			
	}
	public static Integer findMinInteger()
{

		ArrayList<Integer> al=new ArrayList<Integer>();
		
		Integer i5= al.stream().min((i1,i2) ->i1.compareTo(i2)).get();
		
		return i5;
		
}

public static void main(String args[])
{
	ArrayList<String> al =new ArrayList<String>();
	al.add("chiranjeevi");
	al.add("nagarjuna");
	al.add("ramu");
	al.add("srikanth");
	al.add("silksmitha");
	System.out.println(al);
	
	//here collect method  collects element fom stream
	List<String> l=al.stream().filter(s-> s.length() >= 9).collect(Collectors.toList());
	
	// convertinvg array list elements to upper case
	
	List<String> ls=al.stream().map(k-> k.toUpperCase()).collect(Collectors.toList());
	
	System.out.println(l);
	System.out.println(ls);
	
	
	//using count method 
	
	long count  =al.stream().filter(s-> s.length() >= 9).count();
		System.out.println(count); 
		
		// using sorted method in a stream
		List<String> sortedls=al.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedls);
		
		//finding minimum and maximum values using streams
		findMaxInteger();
		
		
		l.stream().forEach(s ->System.out.println(s));
		
		
		//stream class of  method 
		
		Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream.forEach(p -> System.out.println(p));
	}

}
