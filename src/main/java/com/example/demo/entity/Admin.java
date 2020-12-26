package com.example.demo.entity;

import javax.persistence.*;


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
}