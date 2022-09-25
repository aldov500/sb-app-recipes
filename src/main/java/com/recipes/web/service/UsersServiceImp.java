package com.recipes.web.service;

import com.recipes.web.model.UsersDto;
import com.recipes.web.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsersServiceImp implements UsersService {
    @Autowired
    private UsersRepository repository;

    @Override
    public List<UsersDto> getAll() {
        return repository.findAll();
    }

    @Override
    public UsersDto get(UUID id) {
        // With the repository execute sql to the database
        return repository.get(id);
    }

    @Override
    public UsersDto save(UsersDto usersDto) {
        // With the repository execute sql to the database
        return repository.create(usersDto);
    }

    @Override
    public UsersDto update(UUID id, UsersDto usersDto) {
        return repository.update(id, usersDto);
    }

    @Override
    public UsersDto delete(UUID id) {
        return repository.delete(id);
    }


}