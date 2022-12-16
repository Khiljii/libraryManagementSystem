package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Library;
import com.example.libraryManagementSystem.libraryManagementSystem.service.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/library")
public class LibraryResource {

    private final LibraryService libraryService;

    public LibraryResource(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/librarybooks")
    public List<Library> getAllBooks() {
        return libraryService.findAll();
    }
    @PostMapping("/savelibrarybook")
    public Library saveBooks(@RequestBody Library library){
        return libraryService.save(library);
    }
    @GetMapping("/librarybook/{id}")
    public Optional<Library> retriveBook(@PathVariable long id){
        return libraryService.findById(id);
    }
}
