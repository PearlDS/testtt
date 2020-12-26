package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Set;

@Entity
@Table(name = "treatmentDetails")
public class TreatmentDetails { //hier french manicure
    @Id
    @GeneratedValue
    Integer id;
    String name;
    Time approxTime;
    String approxPrice;
    String description;
    @ManyToOne
    TreatmentType treatmentType;


    @ManyToMany
    @JoinTable(name = "specialistCanDoTreatment", joinColumns = {@JoinColumn(name = "specialist_id")},
            inverseJoinColumns = {@JoinColumn(name = "treatmentDetails_id")})
    Set<Specialist> specialists;

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

    public Time getApproxTime() {
        return approxTime;
    }

    public void setApproxTime(Time approxTime) {
        this.approxTime = approxTime;
    }

    public String getApproxPrice() {
        return approxPrice;
    }

    public void setApproxPrice(String approxPrice) {
        this.approxPrice = approxPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TreatmentType getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(TreatmentType treatmentType) {
        this.treatmentType = treatmentType;
    }

    public Set<Specialist> getSpecialists() {
        return specialists;
    }

    public void setSpecialists(Set<Specialist> specialists) {
        this.specialists = specialists;
    }

    @Override
    public String toString() {
        return "TreatmentDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", approxTime=" + approxTime +
                ", approxPrice='" + approxPrice + '\'' +
                ", description='" + description + '\'' +
                ", treatmentType=" + treatmentType +
                ", specialists=" + specialists +
                '}';
    }
}
