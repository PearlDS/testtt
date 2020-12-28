package com.example.demo.entity;



import javax.persistence.*;
import java.util.List;

//@Entity
//@Table(name="roles")
public class  Role  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String role;
    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
    private List<User> users;





}

