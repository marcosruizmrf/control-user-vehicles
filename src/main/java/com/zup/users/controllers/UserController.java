package com.zup.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zup.users.models.User;
import com.zup.users.repositories.UserRepository;

@RestController
@RequestMapping("/usuarios")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	/*@GetMapping
	public User getUser() {
		return apiExterna.getUser();
	} */
	
	
	
	
	@GetMapping
	public ResponseEntity<List<User>> listAll() {
		List<User> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User adicionar(@RequestBody User user) {
		return repository.save(user);
	}
	
	
}
