package com.example.collegedirectory.service;

import com.example.collegedirectory.model.StudentProfile;
import com.example.collegedirectory.repository.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentProfileRepository studentProfileRepository;

    public List<StudentProfile> getAllStudents() {
        return studentProfileRepository.findAll();
    }

    public StudentProfile addStudent(StudentProfile studentProfile) {
        return studentProfileRepository.save(studentProfile);
    }
}
