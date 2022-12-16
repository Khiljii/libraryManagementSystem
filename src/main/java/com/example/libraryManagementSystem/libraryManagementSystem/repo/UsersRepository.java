package com.example.libraryManagementSystem.libraryManagementSystem.repo;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
}
