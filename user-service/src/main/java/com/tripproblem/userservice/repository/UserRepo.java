package com.tripproblem.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripproblem.userservice.model.User;

public interface UserRepo extends JpaRepository<User, Long>{


} 


