package com.example.libraryManagementSystem.libraryManagementSystem.service;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Request;

import java.util.List;
import java.util.Optional;

public interface RequestService {
    Optional<Request> findById(Long id);
    Request save(Request request);
    Request update(Request request);
    List<Request> findAll();
    void deleteById(Long id);
}
