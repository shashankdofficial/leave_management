package com.leavemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leavemanagement.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
