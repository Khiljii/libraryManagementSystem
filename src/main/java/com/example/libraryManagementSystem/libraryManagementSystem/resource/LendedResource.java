package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Lended;
import com.example.libraryManagementSystem.libraryManagementSystem.service.LendedService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lended")
public class LendedResource {

    private final LendedService lendedService;

    public LendedResource(LendedService lendedService) {
        this.lendedService = lendedService;
    }

    @GetMapping("/lendrecord")
    public List<Lended> getAllLends() {
        return lendedService.findAll();
    }
    @PostMapping("/savelend")
    public Lended saveLends(@RequestBody Lended lended){
        return lendedService.save(lended);
    }
    @GetMapping("/lend/{id}")
    public Optional<Lended> retriveLend(@PathVariable long id){
        return lendedService.findById(id);
    }
}
