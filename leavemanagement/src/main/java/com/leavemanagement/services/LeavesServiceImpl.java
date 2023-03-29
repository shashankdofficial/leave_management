package com.leavemanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.leavemanagement.entities.Employee;
import com.leavemanagement.entities.Leaves;
import com.leavemanagement.entities.LeavesDTO;
import com.leavemanagement.exceptions.UserDoesNotExist;
import com.leavemanagement.repository.EmployeeRepository;

@Service
public class LeavesServiceImpl implements LeavesService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
//	@Autowired
//	private Leaves leaves;

	@Override
	public ResponseEntity<List<Leaves>> getAllLeavesOfEmployee(LeavesDTO leaveDto) {
		Employee emp = employeeRepository.findByEmail(leaveDto.getEmployee().getEmail());
		
		if(emp == null) throw new UserDoesNotExist("User is not registered.");
		
		List<Leaves> employeeLeaves = emp.getLeavesDetails();
		
		return new ResponseEntity<>(employeeLeaves , HttpStatus.OK);
	}

}
