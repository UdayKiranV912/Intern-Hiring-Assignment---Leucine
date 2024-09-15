package com.example.collegedirectory.controller;

import com.example.collegedirectory.model.StudentProfile;
import com.example.collegedirectory.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentProfile> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public StudentProfile addStudent(@RequestBody StudentProfile studentProfile) {
        return studentService.addStudent(studentProfile);
    }
}
