package com.joalvarez.springsecurity.data.dao;

import com.joalvarez.baseframework.data.dao.BaseJPADAO;
import com.joalvarez.springsecurity.data.domain.User;
import com.joalvarez.springsecurity.data.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserDAO extends BaseJPADAO<UserRepository, User, UUID> {

	public UserDAO(UserRepository repository) {
		super(repository);
	}
}
