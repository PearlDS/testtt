package com.example.demo.repo;

import com.example.demo.entity.Admin;
import com.example.demo.entity.AppointmentSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("appointmentSlot")
public interface AppointmentSlotRepository extends JpaRepository<AppointmentSlot, Integer> {
}
