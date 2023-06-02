package com.joalvarez.springsecurity.data.mapper;

import com.joalvarez.baseframework.data.mapper.BaseMapper;
import com.joalvarez.springsecurity.data.domain.Role;
import com.joalvarez.springsecurity.data.dto.RoleDTO;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper extends BaseMapper<RoleDTO, Role> {
}
