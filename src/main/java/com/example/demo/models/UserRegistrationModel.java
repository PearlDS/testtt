package com.example.demo.models;

import javax.validation.constraints.Size;

public class UserRegistrationModel {
    private String email;

    @Size(min = 5, message = "Username too short")
    private String username;

    @Size(min = 5, message = "Password too short")
    private String password;

    private String additionalRole;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdditionalRole() {
        return additionalRole;
    }

    public void setAdditionalRole(String additionalRole) {
        this.additionalRole = additionalRole;
    }
}


