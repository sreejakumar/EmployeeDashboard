package com.dashboard.model;

import java.util.List;

public class EmployeeResponse {
	
	private List<EmployeeDetails> employeeDetails;

	public List<EmployeeDetails> getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(List<EmployeeDetails> employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public EmployeeResponse(List<EmployeeDetails> employeeDetails) {
		super();
		this.employeeDetails = employeeDetails;
	}

	public EmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

		

}
