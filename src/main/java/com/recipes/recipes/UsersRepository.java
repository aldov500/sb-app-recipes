package com.recipes.recipes;

import org.springframework.data.repository.Repository;

import java.util.List;


public interface UsersRepository extends Repository<Users, Integer> {

    List<Users> findAll();
}
