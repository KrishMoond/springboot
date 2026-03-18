package com.example.demo.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserInfo;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {
    
    private UserRepo repo;
    private PasswordEncoder passwordEncoder;
    
    public UserService(UserRepo repo, PasswordEncoder passwordEncoder) {
        this.repo = repo;
        this.passwordEncoder = passwordEncoder;
    }
    
    public UserInfo createUser(UserDto dto) {
        UserInfo info = new UserInfo();
        
        info.setName(dto.getName());
        info.setEmail(dto.getEmail());
        info.setPassword(passwordEncoder.encode(dto.getPassword()));
        info.setPhone(dto.getPhone());

        return repo.save(info);
    }
    
    
}