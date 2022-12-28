package com.example.libraryManagementSystem.libraryManagementSystem.mapper;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.BookDto;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersDto;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookDto toDto(Books books){
        BookDto bookDto = new BookDto();
        bookDto.setBookName(books.getBookName());
        bookDto.setId(books.getId());
        bookDto.setAuthors(books.getAuthorsRelation());

        return bookDto;
    }

    public Books toBook(BookDto bookDto) {
        Books books = new Books();
        books.setId(bookDto.getId());
        books.setBookName(bookDto.getBookName());
        books.setAuthorsRelation(bookDto.getAuthors());

        return books;
    }
}
