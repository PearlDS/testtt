package com.example.demo.repo;

import com.example.demo.entity.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("treatmentRepository")
public interface TreatmentRepository extends JpaRepository<Treatment, Integer> {
}
