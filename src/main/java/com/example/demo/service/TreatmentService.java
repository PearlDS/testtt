package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repo.AdminRepository;

import com.example.demo.repo.TreatmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentService {
    @Autowired
    private TreatmentRepository treatmentRepository;


    public void create(Treatment treatment) {
            treatmentRepository.save(treatment);
        }

        }


