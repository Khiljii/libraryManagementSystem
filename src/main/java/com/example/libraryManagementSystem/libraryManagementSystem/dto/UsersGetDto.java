package com.example.libraryManagementSystem.libraryManagementSystem.dto;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Authorities;

import java.util.List;
import java.util.Set;

public class UsersGetDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<String> authorities;

    public UsersGetDto(String name, List<String> roles) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }
}
