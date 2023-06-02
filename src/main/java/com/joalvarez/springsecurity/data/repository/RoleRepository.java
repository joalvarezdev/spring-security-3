package com.joalvarez.springsecurity.data.repository;

import com.joalvarez.baseframework.data.repository.GenericRepository;
import com.joalvarez.springsecurity.data.domain.Role;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends GenericRepository<Role, Long> {

	Optional<Role> findByName(String name);
}
