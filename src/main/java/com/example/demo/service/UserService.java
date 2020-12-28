package com.example.demo.service;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Client;
import com.example.demo.entity.Specialist;
import com.example.demo.entity.User;
import com.example.demo.repo.AdminRepository;
import com.example.demo.repo.ClientRepository;
import com.example.demo.repo.SpecialistRepository;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class UserService {


    @Autowired
    private AdminRepository adminRepository;


    @Autowired
    private UserRepository userRepository;

    public Admin createAdmin(Admin admin) {
        User user = admin.getUser();
        user.setUsername("A");
        user.setEmail("A");
        user.setPassword("A");
        user.setRole("ROLE_ADMIN");
        user.setActive(true);
        admin.setUser(user);
        return adminRepository.save(admin);
    }

//    public void createClient(Client client){
//        User user=client.getUser();
//        user.setRole("ROLE_CLIENT");
//        client.setUser(user);
//        clientRepository.save(client);
//    }
//
//    public void createSpecialist(Specialist specialist){
//        User user=specialist.getUser();
//        user.setRole("ROLE_SPECIALIST");
//        specialist.setUser(user);
//        specialistRepository.save(specialist);
//    }

}



