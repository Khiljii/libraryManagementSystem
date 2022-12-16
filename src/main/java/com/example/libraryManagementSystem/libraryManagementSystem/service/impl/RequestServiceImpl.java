package com.example.libraryManagementSystem.libraryManagementSystem.service.impl;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Books;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Request;
import com.example.libraryManagementSystem.libraryManagementSystem.repo.RequestRepository;
import com.example.libraryManagementSystem.libraryManagementSystem.service.BooksService;
import com.example.libraryManagementSystem.libraryManagementSystem.service.RequestService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;

    public RequestServiceImpl(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @Override
    public Optional<Request> findById(Long id) {
        return requestRepository.findById(id);
    }

    @Override
    public Request save(Request request) {
        Request request1= new Request();
        request1.setId(request.getId());
        request1.setUsersid(request.getUsersid());
        request1.setLibraryid(request.getLibraryid());
        request1.setStartDate(request.getStartDate());
        request1.setEndDate(request.getEndDate());
        return requestRepository.save(request1);
    }

    @Override
    public Request update(Request request) {
        return null;
    }


    @Override
    public List<Request> findAll() {
        return requestRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        requestRepository.deleteById(id);
    }
}
