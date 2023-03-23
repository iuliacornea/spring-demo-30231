package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID uuid;

    public String email;

    public String password;

    public String firstName;

    public String lastName;

    public User() {
    }
}
