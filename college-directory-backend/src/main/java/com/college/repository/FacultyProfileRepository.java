package com.college.repository;

import com.example.collegedirectory.model.FacultyProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyProfileRepository extends JpaRepository<FacultyProfile, Long> {
}

