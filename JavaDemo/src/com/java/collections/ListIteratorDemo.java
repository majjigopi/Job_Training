package com.java.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo
{
	public static void main(String args[])
	{
		
		List<String> linkedList=new LinkedList<String>();
		
		linkedList.add("chiru");
		linkedList.add("krishna");
		linkedList.add("nag");
		linkedList.add("akkenei");
		
		ListIterator listIterator=linkedList.listIterator();
		
		while(listIterator.hasNext())
		{
			String name=(String) listIterator.next();
			
		    
			if(name.equals("chiru"))
				listIterator.remove();
			
			else if(name.equals("krishna"))
			{
			     listIterator.add("lovely krishan");
			}	
			
			
		}
		System.out.println(linkedList);
	}

}
