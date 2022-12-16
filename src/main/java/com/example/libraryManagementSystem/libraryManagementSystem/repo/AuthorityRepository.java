package com.example.libraryManagementSystem.libraryManagementSystem.repo;


import com.example.libraryManagementSystem.libraryManagementSystem.dao.Authorities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authorities,Long> {
}
