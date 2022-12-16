package com.example.libraryManagementSystem.libraryManagementSystem.service.impl;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Author;
import com.example.libraryManagementSystem.libraryManagementSystem.repo.AuthorRepository;
import com.example.libraryManagementSystem.libraryManagementSystem.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Optional<Author> findById(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author update(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }
}
