package com.example.libraryManagementSystem.libraryManagementSystem.service.impl;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Lended;
import com.example.libraryManagementSystem.libraryManagementSystem.repo.LendedRepository;
import com.example.libraryManagementSystem.libraryManagementSystem.service.LendedService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LendedServiceImpl implements LendedService {

    private final LendedRepository lendedRepository;

    public LendedServiceImpl(LendedRepository lendedRepository) {
        this.lendedRepository = lendedRepository;
    }

    @Override
    public Optional<Lended> findById(Long id) {
        return lendedRepository.findById(id);
    }

    @Override
    public Lended save(Lended lended) {
        return lendedRepository.save(lended);
    }

    @Override
    public Lended update(Lended lended) {
        return lendedRepository.save(lended);
    }

    @Override
    public List<Lended> findAll() {
        return lendedRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        lendedRepository.deleteById(id);
    }

}
