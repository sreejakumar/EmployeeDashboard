package com.dashboard.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")
public class EmployeeEntity {
	
	@Id
	@Column(name = "Employee_Id")
    private String empId;
	
	@Column(name = "Emp_Name")
	private String empName;

	@Column(name = "Designation")
	private String designation;
	
	@Column(name = "Department")
	private String department;
	
	@Column(name = "Role")
	private String role;

	public EmployeeEntity(String empId, String empName, String designation, String department, String role) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.department = department;
		this.role = role;
	}

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

    
	
	

}
