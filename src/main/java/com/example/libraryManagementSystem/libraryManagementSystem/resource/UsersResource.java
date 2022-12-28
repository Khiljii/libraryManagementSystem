package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Authorities;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersDto;
import com.example.libraryManagementSystem.libraryManagementSystem.mapper.UsersMapper;
import com.example.libraryManagementSystem.libraryManagementSystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
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

    private UsersMapper mapper;

    public UsersResource(UsersService usersService) {
        this.usersService = usersService;
    }


    @GetMapping("/find-all")
    @ResponseBody
    public List<UsersDto> getAllUsers() {
        return usersService.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }


    @PostMapping("/create")
    @ResponseBody
    public Users create(@RequestBody UsersDto usersDto){

        Users users = mapper.toUser(usersDto);
        Boolean aut = usersDto.getAdmin();
        Authorities authorities= new Authorities();
        if(aut){
            authorities.setName("admin");
        }
        else {
            authorities.setName("user");
        }
        Set<Authorities> auth= new HashSet<>();
        auth.add(authorities);
        users.setAuthorities(auth);

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
