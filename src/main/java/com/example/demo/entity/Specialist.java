package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "specialists")
public class Specialist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String telephoneNumber;

    @ManyToMany(mappedBy = "specialists")
    Set<TreatmentDetails> treatmentDetails;

    @OneToMany(mappedBy = "specialist")
    List<AppointmentSlot> appointmentSlot;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToOne
    Address address;

}