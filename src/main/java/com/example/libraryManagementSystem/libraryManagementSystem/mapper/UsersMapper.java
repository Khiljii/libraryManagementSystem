package com.example.libraryManagementSystem.libraryManagementSystem.mapper;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Authorities;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.BookDto;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersDto;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersLoginDto;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;


public class UsersMapper {
    public static UsersDto toDto(Users users){
        UsersDto usersDto = new UsersDto();
        usersDto.setFirstName(users.getFirstName());
        usersDto.setLastName(users.getLastName());
        usersDto.setEmail(users.getEmail());
        usersDto.setId(users.getId());
        return usersDto;
    }

    public static Users toUser(UsersLoginDto usersLoginDto) {
        Users users = new Users();
        users.setId(usersLoginDto.getId());
        users.setFirstName(usersLoginDto.getFirstName());
        users.setLastName(usersLoginDto.getLastName());
        users.setEmail(usersLoginDto.getEmail());
        users.setPassword(usersLoginDto.getPassword());
        return users;
    }


}
