package com.example.libraryManagementSystem.libraryManagementSystem.service.impl;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Library;
import com.example.libraryManagementSystem.libraryManagementSystem.repo.LibraryRepository;
import com.example.libraryManagementSystem.libraryManagementSystem.service.LibraryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryServiceImpl(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public Optional<Library> findById(Long id) {
        return libraryRepository.findById(id);
    }

    @Override
    public Library save(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public Library update(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public List<Library> findAll() {
        return libraryRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        libraryRepository.deleteById(id);
    }
}
