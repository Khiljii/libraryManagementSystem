package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UsersResource {

    @Autowired
   private final UsersService usersService;

    public UsersResource(UsersService usersService) {
        this.usersService = usersService;
    }


    @GetMapping("/find-all")
    public List<Users> getAllUsers() {
        return usersService.findAll();
    }


    @PostMapping("/create")
    public Users create(@RequestBody Users users){
        return usersService.save(users);
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
