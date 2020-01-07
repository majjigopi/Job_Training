package com.java.json.tojavabinding.sample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//this annotation makes to ignore any unknow properties in json data other the mentioned  fields in the given class
// in this class we are ignoring property "comapnyname" which is in the json file
@JsonIgnoreProperties(ignoreUnknown=true)
public class Employee {
	
	public String employeename;
	public int salary;
	public boolean married;
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	@Override
	public String toString() {
		return "Employee [employeename=" + employeename + ", salary=" + salary + ", married=" + married + "]";
	}
	

}
