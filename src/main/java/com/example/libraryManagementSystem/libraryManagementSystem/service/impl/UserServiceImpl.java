package com.example.libraryManagementSystem.libraryManagementSystem.service.impl;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.repo.UsersRepository;
import com.example.libraryManagementSystem.libraryManagementSystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UsersService {

    @Autowired
    private final UsersRepository usersRepository;

    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Optional<Users> findById(Long id) {
        return usersRepository.findById(id);
    }

    @Override
    public Users save(Users users) {
        Users user1 = new Users();
        user1.setId(users.getId());
        user1.setFirstName(users.getFirstName());
        user1.setLastName(users.getLastName());
        user1.setEmail(users.getEmail());
        user1.setAuthorities(users.getAuthorities());
        return usersRepository.save(user1);
    }

    @Override
    public Users update(Users users) {
        Users user1 = new Users();
        user1.setId(users.getId());
        user1.setFirstName(users.getFirstName());
        user1.setLastName(users.getLastName());
        user1.setEmail(users.getEmail());
        user1.setAuthorities(users.getAuthorities());
        return usersRepository.save(user1);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        usersRepository.deleteById(id);
    }
}
