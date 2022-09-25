package com.recipes.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {

    @Id @Column @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column private String name;
    @Column private String username;
    @Column private String password;

}
