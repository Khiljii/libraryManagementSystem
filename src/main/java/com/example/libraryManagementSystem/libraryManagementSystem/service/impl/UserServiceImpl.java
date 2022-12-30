package com.example.libraryManagementSystem.libraryManagementSystem.service.impl;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;
import com.example.libraryManagementSystem.libraryManagementSystem.dto.UsersLoginDto;
import com.example.libraryManagementSystem.libraryManagementSystem.enums.SystemAuthorities;
import com.example.libraryManagementSystem.libraryManagementSystem.mapper.UsersMapper;
import com.example.libraryManagementSystem.libraryManagementSystem.repo.UsersRepository;
import com.example.libraryManagementSystem.libraryManagementSystem.service.AuthorityService;
import com.example.libraryManagementSystem.libraryManagementSystem.service.UsersService;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

@Service
public class UserServiceImpl implements UsersService {

    private final UsersRepository usersRepository;
    private final AuthorityService authorityService;

    public UserServiceImpl(UsersRepository usersRepository, AuthorityService authorityService) {
        this.usersRepository = usersRepository;
        this.authorityService = authorityService;
    }

    @Override
    public Optional<Users> findById(Long id) {
        return usersRepository.findById(id);
    }

    @Override
    public Users save(UsersLoginDto usersDto) throws NoSuchAlgorithmException {
        String pass = usersDto.getPassword();
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] encode = md.digest(pass.getBytes());
        BigInteger bigInteger = new BigInteger(1,encode);

        usersDto.setPassword(bigInteger.toString(16));

        /**Encode By Base64
        /*
        Base64.getEncoder().encodeToString(pass.getBytes(StandardCharsets.UTF_8))
         */
        /**Decode By Base64

        byte[] decode= Base64.getDecoder().decode(pass);
        String decodedPass = new String(decode);
         */

        Users users = UsersMapper.toUser(usersDto);
        if(usersDto.getAdmin() != null && usersDto.getAdmin())
            users.setAuthorities(new HashSet<>(Arrays.asList(
                    authorityService.findById(SystemAuthorities.admin.name()).get(),
                    authorityService.findById(SystemAuthorities.user.name()).get()
                    )));
        else
            users.setAuthorities(new HashSet<>(Arrays.asList(
                    authorityService.findById(SystemAuthorities.user.name()).get())));


        /**Second approach
         * /
         users = usersDto.getAdmin() ?
                users.withAuthorities(new HashSet<>(Arrays.asList(
                        authorityService.findById(SystemAuthorities.admin.toString()).get()))) :
                users.withAuthorities(new HashSet<>(Arrays.asList(
                        authorityService.findById(SystemAuthorities.user.toString()).get())));
        */

        return usersRepository.save(users);
    }


    @Override
    public Users update(Users users) {
        Users user1 = new Users();
        user1.setId(users.getId());
        user1.setFirstName(users.getFirstName());
        user1.setLastName(users.getLastName());
        user1.setEmail(users.getEmail());
        user1.setAuthorities(users.getAuthorities());


        return usersRepository.save(user1);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        usersRepository.deleteById(id);
    }
}
