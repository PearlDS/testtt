package com.example.demo;

import com.example.demo.entity.Admin;
import com.example.demo.entity.User;
import com.example.demo.repo.AdminRepository;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestApplication {


	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}



}
