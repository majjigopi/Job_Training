package com.bharath.spring.springcore;

import java.util.List;

public class Hospital {
	
	private String name;
	private List patientDetails;
	public List getPatientDetails() {
		return patientDetails;
	}
	public void setPatientDetails(List patientDetails) {
		this.patientDetails = patientDetails;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
