package com.example.libraryManagementSystem.libraryManagementSystem.service;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Author;


import java.util.List;
import java.util.Optional;

public interface AuthorService {
    Optional<Author> findById(Long id);
    Author save(Author author);
    Author update(Author author);
    List<Author> findAll();
    void deleteById(Long id);
}
