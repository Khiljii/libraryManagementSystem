package com.example.libraryManagementSystem.libraryManagementSystem.dao;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "author_name")
    private String authorName;


    @ManyToMany(mappedBy = "authorsRelation")
    private Set<Books> booksRelation = new HashSet<>();

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Set<Books> getBooksRelation() {
        return booksRelation;
    }

    public void setBooksRelation(Set<Books> booksRelation) {
        this.booksRelation = booksRelation;
    }
}
