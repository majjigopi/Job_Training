package com.java.json.tojavabinding.sample;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaJsonBindin {
	
	
	public static void main(String args[]) throws Exception, JsonMappingException, IOException
	{
		ObjectMapper objectMap=new ObjectMapper();
		
		
		Employee emp=objectMap.readValue(new File("C:\\Users\\gmajji\\micro-service\\Spring-Rest\\src\\main\\resources\\employee.json"), Employee.class);
		
		System.out.println("Name of the Employee    :  "+emp.getEmployeename());
		System.out.println("Salary of the Employee  :  "+emp.getSalary());
		System.out.println("Does  Employee married  :  "+emp.isMarried());
		
	}

}
