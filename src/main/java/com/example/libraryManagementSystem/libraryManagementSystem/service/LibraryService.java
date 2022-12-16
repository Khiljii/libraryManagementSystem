package com.example.libraryManagementSystem.libraryManagementSystem.service;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Library;

import java.util.List;
import java.util.Optional;

public interface LibraryService {
    Optional<Library> findById(Long id);
    Library save(Library library);
    Library update(Library library);
    List<Library> findAll();
    void deleteById(Long id);
}
