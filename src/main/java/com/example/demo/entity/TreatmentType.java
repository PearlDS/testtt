package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "treatmentType")
public class TreatmentType {  //(hier manicure
    @Id
    @GeneratedValue
    Integer Id;
    String treatmentType;
    @OneToMany(mappedBy = "treatmentType")
    List<TreatmentDetails> treatmentDetails;  //hier french manicure

    @ManyToOne
    Treatment treatment;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public List<TreatmentDetails> getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(List<TreatmentDetails> treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "TreatmentType{" +
                "Id=" + Id +
                ", treatmentType='" + treatmentType + '\'' +
                ", treatmentDetails=" + treatmentDetails +
                ", treatment=" + treatment +
                '}';
    }
}
