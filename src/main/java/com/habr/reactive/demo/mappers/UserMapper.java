package com.habr.reactive.demo.mappers;

import com.habr.reactive.demo.dto.UserDto;
import com.habr.reactive.demo.entities.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDto entityToDto(User entity);
    User dtoToEntity(UserDto dto);
}
