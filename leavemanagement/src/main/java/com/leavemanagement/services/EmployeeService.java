package com.leavemanagement.services;

import org.springframework.http.ResponseEntity;

import com.leavemanagement.entities.Employee;

public interface EmployeeService {

	public ResponseEntity<Employee> insertCustomer(Employee employee);
	
	public ResponseEntity<Employee> updateCustomer(Employee employee,String email,String pass);
	
	public ResponseEntity<String> deleteCustomer(Employee employee);

}
