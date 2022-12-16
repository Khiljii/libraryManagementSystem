package com.example.libraryManagementSystem.libraryManagementSystem.repo;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Lended;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LendedRepository extends JpaRepository<Lended,Long> {
}
