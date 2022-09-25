package com.recipes.web.repository;

import com.recipes.web.model.UsersDto;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;


public interface UsersRepository extends Repository<UsersDto, Integer> {
    List<UsersDto> findAll();
    UsersDto get(UUID id);
    UsersDto delete(UUID id);
    UsersDto update(UUID id, UsersDto usersDto);
    UsersDto create(UsersDto usersDto);

}
