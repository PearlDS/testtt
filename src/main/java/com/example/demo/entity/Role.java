package com.example.demo.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Embeddable;

@Entity
public class  Role implements GrantedAuthority {
    private Integer id;
    private String authority;


    @Override
    public String getAuthority() {
        return null;
    }
    public void setAuthority(String authority) {
        this.authority = authority;
    }
}

