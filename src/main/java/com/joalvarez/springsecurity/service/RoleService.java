package com.joalvarez.springsecurity.service;

import com.joalvarez.baseframework.service.BaseService;
import com.joalvarez.springsecurity.data.dao.RoleDAO;
import com.joalvarez.springsecurity.data.domain.Role;
import com.joalvarez.springsecurity.data.dto.RoleDTO;
import com.joalvarez.springsecurity.data.mapper.RoleMapper;
import com.joalvarez.springsecurity.exception.GenericException;
import com.joalvarez.springsecurity.exception.InternalCode;
import org.springframework.boot.logging.LogLevel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends BaseService<RoleDAO, RoleMapper, RoleDTO, Role, Long> {

	public RoleService(RoleDAO dao, RoleMapper mapper) {
		super(dao, mapper);
	}

	public RoleDTO findByName(String name) {
		return this.mapper.toDTO(this.dao.findByName(name)
			.orElseThrow(() -> new GenericException(
				HttpStatus.BAD_REQUEST,
				InternalCode.ROLE_NOT_FOUND,
				LogLevel.ERROR,
				"Error: RoleService"
			)));
	}
}
