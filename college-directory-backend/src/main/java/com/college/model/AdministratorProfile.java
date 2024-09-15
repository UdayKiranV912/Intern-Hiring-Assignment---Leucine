package com.example.collegedirectory.model;

import javax.persistence.*;

@Entity
public class AdministratorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Getters and Setters
}
