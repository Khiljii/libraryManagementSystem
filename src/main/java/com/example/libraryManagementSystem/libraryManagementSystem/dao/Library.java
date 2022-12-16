package com.example.libraryManagementSystem.libraryManagementSystem.dao;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "library")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "quantity")
    private String quantity;

    @ManyToOne
    @JoinColumn(columnDefinition = "book_id",referencedColumnName = "id")
    private  Books booksrelation;

    public Library() {
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Books getBooksrelation() {
        return booksrelation;
    }

    public void setBooksrelation(Books booksrelation) {
        this.booksrelation = booksrelation;
    }
}
