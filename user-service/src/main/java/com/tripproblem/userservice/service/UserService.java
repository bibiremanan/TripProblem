package com.tripproblem.userservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripproblem.userservice.model.User;
import com.tripproblem.userservice.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;


	public User saveUser(User user) {
		return userRepo.save(user);
	}


	public Optional<User> getUser(long userId) {
		return userRepo.findById(userId);
	}
}