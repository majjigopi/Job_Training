package com.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class DescendingIntigerComparator implements  Comparator {
	@Override
	public int compare(Object arg0, Object arg1) {
		Integer num_1=(Integer)arg0;
		Integer num_2=(Integer)arg1;
		/*if(num_1 > num_2)
			return -1;
		else if(num_1 < num_2)
			return 1;
		else 
		    return 0;*/
		return 1;
	}
	public static void main(String args[])
	{
		TreeSet set=new TreeSet(new DescendingIntigerComparator());
		set.add(15);
		set.add(15);
		set.add(6);
		set.add(11);
		set.add(20);
		set.add(6);
		set.add(13);
		System.out.println(set);
	}

}
