package com.example.collegedirectory.service;

import com.example.collegedirectory.model.FacultyProfile;
import com.example.collegedirectory.repository.FacultyProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyProfileRepository facultyProfileRepository;

    public List<FacultyProfile> getAllFaculty() {
        return facultyProfileRepository.findAll();
    }

    public FacultyProfile addFaculty(FacultyProfile facultyProfile) {
        return facultyProfileRepository.save(facultyProfile);
    }
}
