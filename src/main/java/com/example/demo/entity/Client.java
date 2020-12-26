package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String telephoneNumber;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "client")
    private List<AppointmentSlot> appointment;

}
