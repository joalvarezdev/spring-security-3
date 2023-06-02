package com.joalvarez.springsecurity.data.dto;

import com.joalvarez.baseframework.data.dto.BaseDTO;

import java.util.UUID;

public class UserRolesDTO implements BaseDTO {

	private UUID userId;
	private Long roleId;

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
}
