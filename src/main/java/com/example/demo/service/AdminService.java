package com.example.demo.service;

import com.example.demo.entity.Admin;
import com.example.demo.entity.User;
import com.example.demo.repo.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;



}