package com.example.collegedirectory.controller;

import com.example.collegedirectory.model.FacultyProfile;
import com.example.collegedirectory.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping
    public List<FacultyProfile> getAllFaculty() {
        return facultyService.getAllFaculty();
    }

    @PostMapping
    public FacultyProfile addFaculty(@RequestBody FacultyProfile facultyProfile) {
        return facultyService.addFaculty(facultyProfile);
    }
}
