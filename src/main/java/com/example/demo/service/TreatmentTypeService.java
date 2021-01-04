package com.example.demo.service;

import com.example.demo.entity.Treatment;
import com.example.demo.entity.TreatmentType;
import com.example.demo.repo.TreatmentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreatmentTypeService {
    @Autowired
    TreatmentTypeRepository treatmentTypeRepository;

    public void createTreatmentType(TreatmentType treatmentType, Treatment treatment) {
        treatmentType.setTreatment(treatment);
        treatmentTypeRepository.save(treatmentType);

    }


}