package com.dashboard.transformer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.dashboard.entities.EmployeeEntity;
import com.dashboard.model.EmployeeDetails;


@Component
public class EmployeeTransformer {
	
	public List<EmployeeDetails> convertEntityToDetails(List<EmployeeEntity> employeeEntityList){
		
		
		List<EmployeeDetails> employeeDetailsList = new ArrayList<>();
		
		if(employeeEntityList != null && employeeEntityList.size()>0)
		{
			
			employeeDetailsList = employeeEntityList.stream()
					.map(obj -> new EmployeeDetails(obj.getEmpId(), obj.getEmpName(), obj.getDesignation() , obj.getDepartment(), obj.getRole() ))
					.collect(Collectors.toList());
					
					
	    }
		
		return employeeDetailsList;
		
	}

}
