package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Authorities;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.Mapper;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersGetDto;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersPostDto;
import com.example.libraryManagementSystem.libraryManagementSystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    private Mapper mapper;

    public UsersResource(UsersService usersService) {
        this.usersService = usersService;
    }


    @GetMapping("/find-all")
    @ResponseBody
    public List<UsersGetDto> getAllUsers() {
        return usersService.findAll().stream().map(mapper::usersGetDto).collect(Collectors.toList());
    }


    @PostMapping("/create")
    @ResponseBody
    public Users create(@RequestBody UsersPostDto usersPostDto){

        Users users = mapper.toUser(usersPostDto);
        Set<Authorities> authorities= usersPostDto.getAuthorities()
                .stream()
                .map(authority -> authorityResource.saveAuthority(authority))
                .collect(Collectors.toSet());
        users.setAuthorities(authorities);

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
