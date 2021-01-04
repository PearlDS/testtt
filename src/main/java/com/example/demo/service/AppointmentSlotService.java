package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repo.AppointmentSlotRepository;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentSlotService {
    @Autowired
   private  AppointmentSlotRepository appointmentSlotRepository;

    @Autowired
    private UserRepository userRepository;

    public Optional<AppointmentSlot> findAllAppointmentsByUserId(User user){//????????/

            return appointmentSlotRepository.findById(user.getId());
        }



//    public List<AppointmentSlot> findAllAppointmentsBySpecialistId(AppointmentSlot appointmentSlot,Specialist specialist){
//        return appointmentSlotRepository.findAllAppointmentsBySpecialistId(specialist.getId());
//    }

    public List <AppointmentSlot> getAllAppointments(){
        List<AppointmentSlot> list = new ArrayList<>();
        appointmentSlotRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    public AppointmentSlot createAppointment(AppointmentSlot appointmentSlot) { ////??????????????????//
        return appointmentSlotRepository.save(appointmentSlot);
    }
    public AppointmentSlot updateAppointment(AppointmentSlot appointmentSlot){
        return appointmentSlotRepository.save(appointmentSlot);
    }
    public  AppointmentSlot deleteAppointment(AppointmentSlot appointmentSlot){
       appointmentSlotRepository.deleteById(appointmentSlot.getId());
       return appointmentSlotRepository.save(appointmentSlot);                ////???????????????//
    }




}
