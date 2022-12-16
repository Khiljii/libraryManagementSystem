package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Authorities;
import com.example.libraryManagementSystem.libraryManagementSystem.repo.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authority")
public class AuthorityResource {

    @Autowired
    private AuthorityRepository authorityRepo;

    @GetMapping("/authority")
    public List<Authorities> getAllAuthories() {
        return authorityRepo.findAll();
    }
    @PostMapping("/saveauthority")
    public Authorities saveAuthority(@RequestBody Authorities authorities){
        Authorities authorities1= new Authorities();
        authorities1.setName(authorities.getName());
        return authorityRepo.save(authorities1);
    }
}
