package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "appointment")
public class AppointmentSlot {
    @Id
    @GeneratedValue
    private Integer id;
    private String status;//reserve
    private Time time;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private Specialist specialist;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

   @ManyToOne(cascade = CascadeType.PERSIST)
   @JoinColumn(name = "treatmentDetails_id")
   private TreatmentDetails treatmentDetails;

    public AppointmentSlot() {}

    public Client getClient() {
        return client;
    }///???????????

    public void setClient(Client client) {
        this.client = client;
    }////?????

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Specialist getSpecialist() {
        return specialist;
    }///??????????

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }///??????


    public TreatmentDetails getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(TreatmentDetails treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    @Override
    public String toString() {
        return "AppointmentSlot{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", time=" + time +
                ", date=" + date +
                ", specialist=" + specialist +
                ", client=" + client +
                ", treatmentType=" + treatmentDetails +
                '}';
    }
}
