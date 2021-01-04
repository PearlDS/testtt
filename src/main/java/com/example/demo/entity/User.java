package com.example.demo.entity;






import javax.persistence.*;
import javax.validation.constraints.Email;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")

public class User  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String username;


	private String email;

	private String password;

	private boolean active;

	private String role;




	public User() {
	}

	public User(String username, String email, String password, boolean active, String role) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.active = active;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				", active=" + active +
				", role='" + role + '\'' +
				'}';
	}
}

