package com.example.libraryManagementSystem.libraryManagementSystem.mapper;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.BookDto;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersDto;
import org.springframework.stereotype.Component;


@Component
public class UsersMapper {
    public UsersDto toDto(Users users){
        UsersDto usersDto = new UsersDto();
        usersDto.setFirstName(users.getFirstName());
        usersDto.setLastName(users.getLastName());
        usersDto.setEmail(users.getEmail());
        usersDto.setId(users.getId());

        return usersDto;
    }

    public Users toUser(UsersDto userDTO) {
        Users users = new Users();
        users.setId(userDTO.getId());
        users.setFirstName(userDTO.getFirstName());
        users.setLastName(userDTO.getLastName());
        users.setEmail(userDTO.getEmail());

        return users;
    }


}
