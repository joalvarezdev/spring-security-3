package com.joalvarez.springsecurity.data.dto;

import com.joalvarez.baseframework.data.dto.BaseDTO;

import java.util.Set;
import java.util.UUID;

public class UserDTO implements BaseDTO {

	private UUID id;
	private String username;
	private String password;
	private String email;
	private Set<String> roles;

	public UserDTO() {}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

}
