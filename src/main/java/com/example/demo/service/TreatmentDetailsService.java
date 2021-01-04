package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repo.TreatmentDetailsRepository;
import com.example.demo.repo.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreatmentDetailsService {

    @Autowired
    TreatmentDetailsRepository treatmentDetailsRepository;

    public void createTreatmentDetails(TreatmentDetails treatmentDetails){
        TreatmentType treatmentType=treatmentDetails.getTreatmentType();
        treatmentDetails.setTreatmentType(treatmentType);


    }
}
