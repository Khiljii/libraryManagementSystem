package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Authorities;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersDto;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersLoginDto;
import com.example.libraryManagementSystem.libraryManagementSystem.mapper.UsersMapper;
import com.example.libraryManagementSystem.libraryManagementSystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UsersResource {

    @Autowired
   private final UsersService usersService;

    private AuthorityResource authorityResource;
    public UsersResource(UsersService usersService) {
        this.usersService = usersService;
    }


    @GetMapping("/find-all")
    public List<UsersDto> findAll() {
        return usersService.findAll().stream().map(UsersMapper::toDto).collect(Collectors.toList());
    }


    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Users save(UsersLoginDto usersDto){
        return usersService.save(usersDto);
    }
    @GetMapping("/{id}")
    public Optional<Users> findById(@PathVariable long id){
       return usersService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable long id){
        usersService.deleteById(id);
        return "Deleted";
    }
}
