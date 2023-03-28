package com.leavemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leavemanagement.entities.Leaves;

@Repository
public interface LeavesRepository extends JpaRepository<Leaves, Integer>{

}
