package com.example.demo.service;

import com.example.demo.entity.*;

import com.example.demo.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
public class UserService implements UserS {


    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private SpecialistRepository specialistRepository;

    @Autowired
    private TreatmentDetailsRepository treatmentDetailsRepository;

    @Autowired
    private UserRepository userRepository;

    public Admin createAdmin(Admin admin) {
        User user = admin.getUser();
        user.setRole("ROLE_ADMIN");
        user.setActive(true);
        admin.setUser(user);

        return adminRepository.save(admin);
    }

    public void createClient(Client client){
        User user=client.getUser();
        user.setRole("ROLE_CLIENT");
        client.setUser(user);
        user.setActive(true);
        clientRepository.save(client);
    }

    public void createSpecialist(Specialist specialist, Set<TreatmentDetails> treatmentDetails){
        User user=specialist.getUser();
        user.setRole("ROLE_SPECIALIST");
        user.setActive(true);
        specialist.setUser(user);
        specialist.setTreatmentDetails(treatmentDetails);
        specialistRepository.save(specialist);
    }

   public Optional<User> getUser(int id){
        return userRepository.findById(id);
    }

    public List <User> getAllUsers(){
        List<User> list = new ArrayList<>();
        userRepository.findAll().forEach(e -> list.add(e));
        return list;
    }
    }




