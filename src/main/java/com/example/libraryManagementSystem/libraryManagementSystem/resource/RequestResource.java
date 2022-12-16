package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Request;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.service.RequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/request")
public class RequestResource {

    private final RequestService requestService;

    public RequestResource(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping("/find-all")
    public List<Request> getAllUsers() {
        return requestService.findAll();
    }


    @PostMapping("/create")
    public Request create(@RequestBody Request request){
        return requestService.save(request);
    }
    @GetMapping("/{id}")
    public Optional<Request> findById(@PathVariable long id){
        return requestService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable long id){
        requestService.deleteById(id);
        return "Deleted";
    }
}
