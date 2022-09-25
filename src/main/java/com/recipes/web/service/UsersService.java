package com.recipes.web.service;

import com.recipes.web.model.UsersDto;

import java.util.List;
import java.util.UUID;

public interface UsersService {
    List<UsersDto> getAll();

    UsersDto get(UUID id);

    UsersDto save(UsersDto usersDto);

    UsersDto update(UUID id, UsersDto usersDto);

    UsersDto delete(UUID id);
}
