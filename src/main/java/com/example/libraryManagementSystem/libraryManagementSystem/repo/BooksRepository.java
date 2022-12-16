package com.example.libraryManagementSystem.libraryManagementSystem.repo;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books,Long> {
}
