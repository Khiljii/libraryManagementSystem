package com.example.libraryManagementSystem.libraryManagementSystem.repo;


import com.example.libraryManagementSystem.libraryManagementSystem.dao.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
}
