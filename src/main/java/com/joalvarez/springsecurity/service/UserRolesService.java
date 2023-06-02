package com.joalvarez.springsecurity.service;

import com.joalvarez.baseframework.service.BaseService;
import com.joalvarez.springsecurity.data.dao.UserRolesDAO;
import com.joalvarez.springsecurity.data.domain.UserRoles;
import com.joalvarez.springsecurity.data.dto.UserRolesDTO;
import com.joalvarez.springsecurity.data.mapper.UserRolesMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserRolesService extends BaseService<UserRolesDAO, UserRolesMapper, UserRolesDTO, UserRoles, UUID> {

	public UserRolesService(UserRolesDAO dao, UserRolesMapper mapper) {
		super(dao, mapper);
	}

}
