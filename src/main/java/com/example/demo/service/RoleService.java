package com.example.demo.service;

import com.example.demo.model.Role;
import com.example.demo.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;


    public Role getRoleByAuthority(String authority) {
        return this.roleRepository.findOneByAuthority(authority);

    }
}
