package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private UserRepository userRepository;



    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<User> findAll() {

        return userRepository.findAll();
    }

}


