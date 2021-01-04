package com.example.demo.repo;

import com.example.demo.entity.TreatmentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TreatmentTypeRepository extends JpaRepository<TreatmentType, Integer> {
}
