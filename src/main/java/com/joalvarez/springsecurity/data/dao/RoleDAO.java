package com.joalvarez.springsecurity.data.dao;

import com.joalvarez.baseframework.data.dao.BaseJPADAO;
import com.joalvarez.springsecurity.data.domain.Role;
import com.joalvarez.springsecurity.data.repository.RoleRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RoleDAO extends BaseJPADAO<RoleRepository, Role, Long> {

	public RoleDAO(RoleRepository repository) {
		super(repository);
	}

	public Optional<Role> findByName(String name) {
		return this.getRepository().findByName(name);
	}
}
