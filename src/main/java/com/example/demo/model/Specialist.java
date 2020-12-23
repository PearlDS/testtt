package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
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

    @OneToOne
    Address address;

}