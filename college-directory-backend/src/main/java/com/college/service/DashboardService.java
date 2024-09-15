package com.college.service;

import com.college.repository.FacultyProfileRepository;
import com.college.repository.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    @Autowired
    private StudentProfileRepository studentProfileRepository;

    @Autowired
    private FacultyProfileRepository facultyProfileRepository;

    public DashboardStatistics getStatistics() {
        long totalStudents = studentProfileRepository.count();
        long totalFaculty = facultyProfileRepository.count();
        // Add more statistics as needed

        return new DashboardStatistics(totalStudents, totalFaculty, 0); // Adjust as needed
    }
}
