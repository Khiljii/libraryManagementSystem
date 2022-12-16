package com.example.libraryManagementSystem.libraryManagementSystem.service.impl;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import com.example.libraryManagementSystem.libraryManagementSystem.repo.BooksRepository;
import com.example.libraryManagementSystem.libraryManagementSystem.service.BooksService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksServiceImpl implements BooksService {

    private final BooksRepository booksRepository;

    public BooksServiceImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public Optional<Books> findById(Long id) {
        return booksRepository.findById(id);
    }

    @Override
    public Books save(Books books) {
        Books books1= new Books();
        books1.setId(books.getId());
        books1.setBookName(books.getBookName());
        books1.setAuthorsRelation(books.getAuthorsRelation());
        return booksRepository.save(books1);
    }

    @Override
    public Books update(Books books) {
        Books books1= new Books();
        books1.setId(books.getId());
        books1.setBookName(books.getBookName());
        books1.setAuthorsRelation(books.getAuthorsRelation());
        return booksRepository.save(books1);
    }

    @Override
    public List<Books> findAll() {
        return booksRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        booksRepository.deleteById(id);
    }
}
