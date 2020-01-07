package com.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class DescendingAlhabeticalOrder implements Comparator  {

	

	@Override
	public int compare(Object o1, Object o2) {
		
		return -(o1.toString().compareTo(o2.toString()));
	}
	
	public static void main(String[] args) {

     TreeSet<String> stringTree=new TreeSet<String>(new DescendingAlhabeticalOrder());
     
     stringTree.add("Ramulamma");
     stringTree.add("vijayBavani");
     stringTree.add("Sarva");
     stringTree.add("pentiyaa");
     System.out.println(stringTree);
     
	}

}
