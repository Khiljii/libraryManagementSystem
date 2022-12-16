package com.example.libraryManagementSystem.libraryManagementSystem.service;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    Optional<Users> findById(Long id);
    Users save(Users users);
    Users update(Users users);
    List<Users> findAll();
    void deleteById(Long id);
}
