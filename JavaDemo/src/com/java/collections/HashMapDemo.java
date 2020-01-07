package com.java.collections;

import java.util.*;

public class HashMapDemo {
	public static void main(String args[]) {
	Map<String,String> map_practice_exericse=new HashMap<String,String>(30);
	map_practice_exericse.put("chiranjeevi", "bokkagadu");
	map_practice_exericse.put("Mahesh Babu", "parledu");
	map_practice_exericse.put("venkatesh", "family_person");
	map_practice_exericse.put("PowerStar", "a monk");
	map_practice_exericse.put("allu arjun", "ap");
	map_practice_exericse.put("JR NTR", "Big ap");
	
	System.out.println(map_practice_exericse);
	//to replace value of the key
	System.out.println(map_practice_exericse.put("chiranjeevi", "smooth person"));//replaces new value and return the old object
	
	Set entryset=map_practice_exericse.entrySet();
	Iterator entryIterator=entryset.iterator();
	
	while(entryIterator.hasNext())
	{
	
	Map.Entry<String, String> mapentires=(Map.Entry<String, String>)entryIterator.next();
	System.out.println(mapentires.getKey()+"----------"+mapentires.getValue());
	}
	
	}

}
