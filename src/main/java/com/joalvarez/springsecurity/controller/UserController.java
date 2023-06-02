package com.joalvarez.springsecurity.controller;

import com.joalvarez.springsecurity.data.dto.UserDTO;
import com.joalvarez.springsecurity.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class UserController {

	private final UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO dto){
		return ResponseEntity.ok(this.service.createUser(dto));
	}
}
