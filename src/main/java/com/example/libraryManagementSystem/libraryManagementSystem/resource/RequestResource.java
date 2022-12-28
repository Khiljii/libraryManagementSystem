package com.example.libraryManagementSystem.libraryManagementSystem.resource;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Request;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.RequestDto;
import com.example.libraryManagementSystem.libraryManagementSystem.mapper.RequestMapper;
import com.example.libraryManagementSystem.libraryManagementSystem.service.RequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/request")
public class RequestResource {

    private final RequestService requestService;
    private RequestMapper requestMapping;

    public RequestResource(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping("/find-all")
    public List<RequestDto> getAllUsers() {
        return requestService.findAll().stream().map(requestMapping::toDto).collect(Collectors.toList());
    }


    @PostMapping("/create")
    public Request create(@RequestBody RequestDto requestDto){
        return requestService.save(requestMapping.toRequest(requestDto));
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
