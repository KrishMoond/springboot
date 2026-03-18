package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserInfo;

public interface UserRepo extends JpaRepository<UserInfo, Integer>{
	 Optional<UserInfo> findByEmail(String email);
}
