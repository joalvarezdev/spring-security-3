package com.joalvarez.springsecurity.service;

import com.joalvarez.baseframework.service.BaseService;
import com.joalvarez.springsecurity.data.dao.UserDAO;
import com.joalvarez.springsecurity.data.domain.User;
import com.joalvarez.springsecurity.data.dto.RoleDTO;
import com.joalvarez.springsecurity.data.dto.UserDTO;
import com.joalvarez.springsecurity.data.dto.UserRolesDTO;
import com.joalvarez.springsecurity.data.mapper.UserMapper;
import jakarta.transaction.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService extends BaseService<UserDAO, UserMapper, UserDTO, User, UUID> {

	private final RoleService roleService;
	private final UserRolesService userRolesService;
	private final PasswordEncoder passwordEncoder;

	public UserService(UserDAO dao, UserMapper mapper, RoleService roleService,
					   UserRolesService userRolesService, PasswordEncoder passwordEncoder) {
		super(dao, mapper);
		this.roleService = roleService;
		this.userRolesService = userRolesService;
		this.passwordEncoder = passwordEncoder;
	}

	public UserDTO createUser(UserDTO dto) {
		Set<RoleDTO> roles = new HashSet<>();

		if (Objects.isNull(dto.getRoles()) || dto.getRoles().isEmpty()) {
			roles.add(this.roleService.get(2L));
		}

		roles = dto.getRoles().stream()
			.map(this.roleService::findByName)
			.collect(Collectors.toSet());

		UserDTO userDTO = this.mapper.toDTO(this.dao.save(User.builder()
			.username(dto.getUsername())
			.password(this.passwordEncoder.encode(dto.getPassword()))
			.email(dto.getEmail())
			.build()));

		roles.forEach(roleDTO -> {
			UserRolesDTO userRolesDTO = new UserRolesDTO();
			userRolesDTO.setUserId(userDTO.getId());
			userRolesDTO.setRoleId(roleDTO.getId());
			this.userRolesService.save(userRolesDTO);
		});

		userDTO.setRoles(roles.stream().map(RoleDTO::getName).collect(Collectors.toSet()));

		return userDTO;
	}
}
