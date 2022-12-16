package com.example.libraryManagementSystem.libraryManagementSystem.service;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;

import java.util.List;
import java.util.Optional;

public interface BooksService {
    Optional<Books> findById(Long id);
    Books save(Books books);
    Books update(Books books);
    List<Books> findAll();
    void deleteById(Long id);
}
