package com.example.libraryManagementSystem.libraryManagementSystem.service;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Authorities;

import java.util.Optional;

public interface AuthorityService {
    Optional<Authorities> findById(String id);
}
