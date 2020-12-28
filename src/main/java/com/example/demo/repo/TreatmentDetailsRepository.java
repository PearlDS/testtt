package com.example.demo.repo;

import com.example.demo.entity.Treatment;
import com.example.demo.entity.TreatmentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentDetailsRepository extends JpaRepository<TreatmentDetails, Integer> {
}
