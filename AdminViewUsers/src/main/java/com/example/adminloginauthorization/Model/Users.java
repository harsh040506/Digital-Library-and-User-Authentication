package com.example.adminloginauthorization.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class Users {

    @Id
    @Column(name = "id",nullable = false)
    private long id;

    @Column(name = "fullname",nullable = false)
    private String fullname;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "username",nullable = false)
    private String username;
}