package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Library;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.LibraryDto;
import com.example.libraryManagementSystem.libraryManagementSystem.mapper.LibraryMapper;
import com.example.libraryManagementSystem.libraryManagementSystem.service.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/library")
public class LibraryResource {

    private final LibraryService libraryService;
    private LibraryMapper libraryMapper;

    public LibraryResource(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/librarybooks")
    public List<LibraryDto> getAllBooks() {
        return libraryService.findAll().stream().map(libraryMapper::toDto).collect(Collectors.toList());
    }
    @PostMapping("/savelibrarybook")
    public Library saveBooks(@RequestBody LibraryDto libraryDto){
        return libraryService.save(libraryMapper.toLibrary(libraryDto));
    }
    @GetMapping("/librarybook/{id}")
    public Optional<Library> retriveBook(@PathVariable long id){
        return libraryService.findById(id);
    }
}
