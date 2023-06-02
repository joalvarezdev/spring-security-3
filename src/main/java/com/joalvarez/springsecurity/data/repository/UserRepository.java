package com.joalvarez.springsecurity.data.repository;

import com.joalvarez.baseframework.data.repository.GenericRepository;
import com.joalvarez.springsecurity.data.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends GenericRepository<User, UUID> {

	Optional<User> findByUsername(String username);
}
