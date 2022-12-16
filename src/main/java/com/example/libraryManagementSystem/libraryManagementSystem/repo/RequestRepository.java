package com.example.libraryManagementSystem.libraryManagementSystem.repo;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request,Long> {
}
