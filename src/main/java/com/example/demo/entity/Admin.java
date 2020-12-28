package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String firstName;

	private String lastName;

	@OneToOne(optional = false)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	public Admin() {
	}

	public Admin( String firstName, String lastName, User user) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}