package com.example.collegedirectory.service;

import com.example.collegedirectory.model.AdministratorProfile;
import com.example.collegedirectory.repository.AdministratorProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdministratorProfileRepository adminProfileRepository;

    public List<AdministratorProfile> getAllAdmins() {
        return adminProfileRepository.findAll();
    }

    public AdministratorProfile addAdmin(AdministratorProfile adminProfile) {
        return adminProfileRepository.save(adminProfile);
    }
}
