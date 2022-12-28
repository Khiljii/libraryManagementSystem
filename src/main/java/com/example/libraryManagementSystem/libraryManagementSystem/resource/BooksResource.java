package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.BookDto;
import com.example.libraryManagementSystem.libraryManagementSystem.mapper.BookMapper;
import com.example.libraryManagementSystem.libraryManagementSystem.service.BooksService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/book")
public class BooksResource {

    private final BooksService booksService;
    private BookMapper mapper;
    public BooksResource(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/all")
    public List<BookDto> getAllBooks() {

        return booksService.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }
    @PostMapping("/savebooks")
    public Books saveBooks(@RequestBody BookDto bookDto){

        return booksService.save(mapper.toBook(bookDto));
    }
    @GetMapping("/book/{id}")
    public Optional<Books> retriveBook(@PathVariable long id){
        return booksService.findById(id);
    }
}
