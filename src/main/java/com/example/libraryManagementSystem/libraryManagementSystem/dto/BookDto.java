package com.example.libraryManagementSystem.libraryManagementSystem.dto;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Author;

import java.util.Set;

public class BookDto {

    private Long id;
    private String bookName;
    private Set<Author> authors;

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
