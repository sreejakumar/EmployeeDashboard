package com.dashboard.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.entities.EmployeeEntity;
import com.dashboard.model.EmployeeDetails;
import com.dashboard.model.EmployeeResponse;
import com.dashboard.repositories.EmployeeRepo;
import com.dashboard.services.EmployeeService;
import com.dashboard.transformer.EmployeeTransformer;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
    @Autowired
	EmployeeRepo employeeRepo;
    
    @Autowired
    EmployeeTransformer employeeTransformer;
	

	@Override
	public EmployeeResponse getEmployeeDetails() {
		
		EmployeeResponse response = new EmployeeResponse();
		// TODO Auto-generated method stub
		
		List<EmployeeEntity> employeeEntity = employeeRepo.findAll();
		
		List<EmployeeDetails> employeeDetailsList = employeeTransformer.convertEntityToDetails(employeeEntity);
		
		//ObjectMapper obj = new ObjectMapper();
		
	
		response.setEmployeeDetails(employeeDetailsList);
		
		
		return response;
		
				
				
		
		
		
		
	}


	
}
