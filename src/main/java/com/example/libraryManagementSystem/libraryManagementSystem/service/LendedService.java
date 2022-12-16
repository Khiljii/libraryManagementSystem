package com.example.libraryManagementSystem.libraryManagementSystem.service;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Lended;

import java.util.List;
import java.util.Optional;

public interface LendedService {
    Optional<Lended> findById(Long id);
    Lended save(Lended lended);
    Lended update(Lended lended);
    List<Lended> findAll();
    void deleteById(Long id);
}
