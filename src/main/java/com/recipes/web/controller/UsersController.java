package com.recipes.web.controller;

import com.recipes.web.model.UsersDto;
import com.recipes.web.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("api/v1/users")
public class UsersController {

    @Autowired
    UsersService service;

    @GetMapping
    public List<UsersDto> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsersDto> get(){
        return new ResponseEntity<>(service.get(UUID.randomUUID()),
                HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody UsersDto usersDto){
        UsersDto savedDto = service.save(usersDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") UUID id, @RequestBody UsersDto usersDto){
        service.update(id, usersDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") UUID id){
        service.delete(id);
    }
}
