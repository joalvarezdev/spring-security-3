package com.joalvarez.springsecurity.data.dao;

import com.joalvarez.baseframework.data.dao.BaseJPADAO;
import com.joalvarez.springsecurity.data.domain.UserRoles;
import com.joalvarez.springsecurity.data.repository.UserRolesRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserRolesDAO extends BaseJPADAO<UserRolesRepository, UserRoles, UUID> {

	public UserRolesDAO(UserRolesRepository repository) {
		super(repository);
	}
}
