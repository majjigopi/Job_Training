package com.java.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetDemo {
	
	public static void main(String args[])
	{
		HashSet hs=new HashSet();
		hs.add("B");
		hs.add("R");
		hs.add("C");
		hs.add("Z");
		hs.add("E");
		hs.add("K");
		System.out.println(hs);
		System.out.println(hs.size());
	}

}
