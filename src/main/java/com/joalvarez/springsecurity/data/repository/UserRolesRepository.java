package com.joalvarez.springsecurity.data.repository;

import com.joalvarez.baseframework.data.repository.GenericRepository;
import com.joalvarez.springsecurity.data.domain.UserRoles;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRolesRepository extends GenericRepository<UserRoles, UUID> {
}
