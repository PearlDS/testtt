package com.example.demo.repo;

import com.example.demo.entity.Admin;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("adminRepository")
public interface AdminRepository  extends JpaRepository<Admin, Integer> {

}

