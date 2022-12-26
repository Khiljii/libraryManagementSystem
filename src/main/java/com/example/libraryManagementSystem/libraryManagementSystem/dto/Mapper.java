package com.example.libraryManagementSystem.libraryManagementSystem.dto;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Authorities;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

@Component
public class Mapper {
    public UsersGetDto usersGetDto(Users users){
        String name = users.getFirstName();
        List<String> roles = users
                .getAuthorities()
                .stream()
                .map(Authorities::getName)
                .collect(toList());

        return new UsersGetDto(name, roles);
    }

    public Users toUser(UsersPostDto userDTO) {
        return new Users(userDTO.getId(), userDTO.getFirstName(), userDTO.getLastName(), userDTO.getPassword(), userDTO.getEmail(), userDTO.getAuthorities());
    }
}
