package com.leavemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leavemanagement.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
