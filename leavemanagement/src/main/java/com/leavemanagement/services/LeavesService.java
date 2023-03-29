package com.leavemanagement.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.leavemanagement.entities.Leaves;
import com.leavemanagement.entities.LeavesDTO;

public interface LeavesService {

	public ResponseEntity<List<Leaves>> getAllLeavesOfEmployee(LeavesDTO leaveDto);
}
