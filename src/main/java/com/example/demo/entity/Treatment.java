package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "treatment")
public class Treatment {
    @Id
    @GeneratedValue
    Integer id;
    String name;

    @OneToMany
    (mappedBy ="treatment",cascade = CascadeType.ALL)
    List<TreatmentType> treatmentTypes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TreatmentType> getTreatmentTypes() {
        return treatmentTypes;
    }

    public void setTreatmentTypes(List<TreatmentType> treatmentTypes) {
        this.treatmentTypes = treatmentTypes;
    }


}
