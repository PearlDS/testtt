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

    private String street;

    private String city;

    private String postcode;

    private int houseNumb;

    private int appNumb;




    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    @JoinTable(name = "specialistCanDoTreatment", joinColumns = {@JoinColumn(name = "treatmentDetails_id")},
            inverseJoinColumns = {@JoinColumn(name = "specialist_id")})
    Set<TreatmentDetails> treatmentDetails;

    @OneToMany(mappedBy = "specialist",cascade = CascadeType.PERSIST)
    List<AppointmentSlot> appointmentSlot;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;



    public Specialist() {
    }

    public Specialist(Integer id, String firstName, String lastName, String telephoneNumber, String street, String city, String postcode, int houseNumb, int appNumb, Set<TreatmentDetails> treatmentDetails, List<AppointmentSlot> appointmentSlot, User user) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.houseNumb = houseNumb;
        this.appNumb = appNumb;
       // this.treatmentDetails = treatmentDetails;
        this.appointmentSlot = appointmentSlot;
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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getHouseNumb() {
        return houseNumb;
    }

    public void setHouseNumb(int houseNumb) {
        this.houseNumb = houseNumb;
    }

    public int getAppNumb() {
        return appNumb;
    }

    public void setAppNumb(int appNumb) {
        this.appNumb = appNumb;
    }

    public Set<TreatmentDetails> getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(Set<TreatmentDetails> treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public List<AppointmentSlot> getAppointmentSlot() {
        return appointmentSlot;
    }

    public void setAppointmentSlot(List<AppointmentSlot> appointmentSlot) {
        this.appointmentSlot = appointmentSlot;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                ", houseNumb=" + houseNumb +
                ", appNumb=" + appNumb +
               ", treatmentDetails=" + treatmentDetails +
                ", appointmentSlot=" + appointmentSlot +
                ", user=" + user +
                '}';
    }
}