package com.example.collegedirectory.controller;

import com.example.collegedirectory.model.AdministratorProfile;
import com.example.collegedirectory.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<AdministratorProfile> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @PostMapping
    public AdministratorProfile addAdmin(@RequestBody AdministratorProfile adminProfile) {
        return adminService.addAdmin(adminProfile);
    }
}
