package com.joalvarez.springsecurity.data.dto;

import com.joalvarez.baseframework.data.dto.BaseDTO;

import java.util.UUID;

public class RoleDTO implements BaseDTO {

	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
