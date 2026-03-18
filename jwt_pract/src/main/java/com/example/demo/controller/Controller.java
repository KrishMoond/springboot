package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import com.example.demo.util.JwtUtil;

@RestController
@RequestMapping("/auth")
public class Controller {

    @Autowired
    JwtUtil jwtt;

    @Autowired
    private UserService service;

    @Autowired
    private AuthenticationManager authenticationManager;

    // Generate token manually (testing)
    @GetMapping("/{username}")
    public String user(@PathVariable String username) {
        return jwtt.createToken(username);
    }

    // Extract username from token
    @GetMapping("/g/{token}")
    public String getUsername(@PathVariable String token) {
        return jwtt.getUsername(token);
    }

    // Validate token
    @GetMapping("/check/{username}/{token}")
    public String checkToken(@PathVariable String username,
                             @PathVariable String token) {
        return jwtt.isValidToken(username, token) ? "VALID TOKEN" : "INVALID TOKEN";
    }

    // Register user
    @PostMapping("/create")
    public UserInfo createUser(@RequestBody UserDto dto) {
        return service.createUser(dto);
    }

    // Login — returns JWT in Authorization response header
    @PostMapping("/login")
    public ResponseEntity<Void> login(@RequestBody LoginDto loginDto) {

        Authentication auth = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getEmail(),
                        loginDto.getPassword()
                )
        );

        String token = jwtt.createToken(auth.getName());

        return ResponseEntity.ok()
                .header("Authorization", "Bearer " + token)
                .header("Access-Control-Expose-Headers", "Authorization")
                .build();
    }
}
