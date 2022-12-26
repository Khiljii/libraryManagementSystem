package com.example.libraryManagementSystem.libraryManagementSystem.security;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.repo.UsersRepository;
import com.example.libraryManagementSystem.libraryManagementSystem.security.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Users> user = usersRepository.findByEmail(userName);

        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

        return user.map(MyUserDetails::new).get();

    }
}
