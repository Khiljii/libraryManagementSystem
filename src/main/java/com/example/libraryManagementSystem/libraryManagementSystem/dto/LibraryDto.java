package com.example.libraryManagementSystem.libraryManagementSystem.dto;

import javax.persistence.Column;

public class LibraryDto {

    private Long id;
    private String bookName;
    private String quantity;

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
}
