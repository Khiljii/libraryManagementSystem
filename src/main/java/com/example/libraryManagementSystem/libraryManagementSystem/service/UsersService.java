package com.example.libraryManagementSystem.libraryManagementSystem.service;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersDto;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersLoginDto;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

public interface UsersService {
    Optional<Users> findById(Long id);
    Users save(UsersLoginDto usersLoginDto) throws NoSuchAlgorithmException;
    Users update(Users users);
    List<Users> findAll();
    void deleteById(Long id);
}
