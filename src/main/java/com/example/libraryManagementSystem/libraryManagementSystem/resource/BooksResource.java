package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import com.example.libraryManagementSystem.libraryManagementSystem.service.BooksService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BooksResource {

    private final BooksService booksService;

    public BooksResource(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/all")
    public List<Books> getAllBooks() {
        return booksService.findAll();
    }
    @PostMapping("/savebooks")
    public Books saveBooks(@RequestBody Books books){
        return booksService.save(books);
    }
    @GetMapping("/book/{id}")
    public Optional<Books> retriveBook(@PathVariable long id){
        return booksService.findById(id);
    }
}
