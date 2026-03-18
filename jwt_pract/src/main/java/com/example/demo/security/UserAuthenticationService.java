package com.example.demo.security;

import java.util.Optional;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Component;

import com.example.demo.entity.UserInfo;
import com.example.demo.repo.UserRepo;

@Component
public class UserAuthenticationService implements UserDetailsService {
    
    private final UserRepo userjpa;

    public UserAuthenticationService(UserRepo userjpa) {
        this.userjpa = userjpa;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Optional<UserInfo> info = userjpa.findByEmail(email); // ✅ FIX

        if (info.isPresent()) {
            UserInfo user = info.get();

            System.out.println("User Authentication service: " + email);

            return User.builder() 
                    .username(user.getEmail())
                    .password(user.getPassword())
                    .roles("USER") 
                    .build();
        } else {
            throw new UsernameNotFoundException("User with email " + email + " not found");
        }
    }
}