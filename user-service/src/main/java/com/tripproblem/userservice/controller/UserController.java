package com.tripproblem.userservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripproblem.userservice.model.User;
import com.tripproblem.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userServices;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userServices.saveUser(user);
	}

	@GetMapping("/{id}")
	public Optional<User> getUserById(@PathVariable("id") long userId) {
		return userServices.getUser(userId);
	}
}
