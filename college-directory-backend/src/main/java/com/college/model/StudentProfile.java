package com.example.collegedirectory.model;

import javax.persistence.*;

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String major;

    // Getters and Setters
}
