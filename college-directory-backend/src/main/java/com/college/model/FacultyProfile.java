package com.example.collegedirectory.model;

import javax.persistence.*;

@Entity
public class FacultyProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;

    // Getters and Setters
}
