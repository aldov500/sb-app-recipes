package com.recipes.recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImp implements UsersService{
    @Autowired
    private UsersRepository repository;

    @Override
    public List<Users> selectAll() {
        return repository.findAll();
    }


}
