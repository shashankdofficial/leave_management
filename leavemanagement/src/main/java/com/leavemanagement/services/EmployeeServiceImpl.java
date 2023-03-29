package com.leavemanagement.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.leavemanagement.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public ResponseEntity<Employee> insertCustomer(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Employee> updateCustomer(Employee employee, String email, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> deleteCustomer(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
