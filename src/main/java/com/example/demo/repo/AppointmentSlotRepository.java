package com.example.demo.repo;

import com.example.demo.entity.Admin;
import com.example.demo.entity.AppointmentSlot;
import com.example.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("appointmentSlot")
public interface AppointmentSlotRepository extends JpaRepository<AppointmentSlot, Integer> {


   List<AppointmentSlot> findAllAppointmentsByClientId(Integer id);

   List<AppointmentSlot> findAllAppointmentsBySpecialistId(Integer id);


}
