package com.joalvarez.springsecurity.data.mapper;

import com.joalvarez.baseframework.data.mapper.BaseMapper;
import com.joalvarez.springsecurity.data.domain.UserRoles;
import com.joalvarez.springsecurity.data.dto.UserRolesDTO;
import org.springframework.stereotype.Component;

@Component
public class UserRolesMapper extends BaseMapper<UserRolesDTO, UserRoles> {
}
