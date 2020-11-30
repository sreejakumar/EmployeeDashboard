package com.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.model.EmployeeDetails;
import com.dashboard.model.EmployeeResponse;
import com.dashboard.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeDashboardController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/dashboard")
	public EmployeeResponse getAllEmployeeDetails() {
	
		
	return	employeeService.getEmployeeDetails();
		
	}
	
	
}
