package com.leavemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leavemanagement.entities.Leaves;
import com.leavemanagement.entities.LeavesDTO;
import com.leavemanagement.services.LeavesService;

@RestController
public class EmployeeController {
	
	@Autowired
	private LeavesService leavesService;
    
	@GetMapping("/login")
	public String test() {
		return "Shashank";
	}
	
	@PostMapping("/leavelist")
	public ResponseEntity<List<Leaves>> getAllLeavesOfEmployee(@RequestBody LeavesDTO leaveDto){
		return leavesService.getAllLeavesOfEmployee(leaveDto);
	}
}
