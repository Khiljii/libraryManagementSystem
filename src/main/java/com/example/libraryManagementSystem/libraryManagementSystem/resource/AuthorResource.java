package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Author;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import com.example.libraryManagementSystem.libraryManagementSystem.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/author")
public class AuthorResource {

    private final AuthorService authorService;

    public AuthorResource(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/author/{id}")
    public Optional<Author> getAuthorById(Long id) {
        return authorService.findById(id);
    }
    @GetMapping("/allAuthor")
    public List<Author> getAllAuthors() {
        return authorService.findAll();
    }
    @PostMapping("/saveAuthor")
    public Author saveAuthor(@RequestBody Author author){
        return authorService.save(author);
    }
    @GetMapping("/authorBooks/{id}")
    public Set<Books> getAuthorBooks(@PathVariable long id){
        Optional<Author> author = authorService.findById(id);
        Author author1 = author.get();
        return author1.getBooksRelation();
    }
}
