package com.leavemanagement.services;

import com.leavemanagement.entities.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
