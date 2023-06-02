package com.joalvarez.springsecurity.data.mapper;

import com.joalvarez.baseframework.data.mapper.BaseMapper;
import com.joalvarez.springsecurity.data.domain.User;
import com.joalvarez.springsecurity.data.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends BaseMapper<UserDTO, User> {
}
